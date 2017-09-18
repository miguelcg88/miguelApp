package com.miguel.angelcalderon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.miguel.angelcalderon.model.Lugar;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;
import org.mapsforge.map.android.util.AndroidUtil;
import org.mapsforge.map.android.view.MapView;
import org.mapsforge.map.datastore.MapDataStore;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.overlay.Marker;
import org.mapsforge.map.layer.renderer.TileRendererLayer;
import org.mapsforge.map.reader.MapFile;
import org.mapsforge.map.rendertheme.InternalRenderTheme;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class Mapa extends AppCompatActivity {
    private static final String LIST_PLACES = "places";

    private MapView mapView;
    private Toolbar toolbar;
    private List<Lugar> mLugars;
    private LatLong centerLocation = new LatLong(-17.3823, -66.1604);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidGraphicFactory.createInstance(this.getApplication());
        setContentView(R.layout.mapa);
        this.mapView = (MapView) findViewById(R.id.mapView);
        this.toolbar = (Toolbar) findViewById(R.id.tb_map);
        this.mapView.setClickable(true);
        this.mapView.getMapScaleBar().setVisible(true);
        this.mapView.setBuiltInZoomControls(true);
        this.mapView.setZoomLevelMin((byte) 14);
        this.mapView.setZoomLevelMax((byte) 19);

        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        setTitle("Mapa");

        // create a tile cache of suitable size
        TileCache tileCache = AndroidUtil.createTileCache(this, "mapcache",
                mapView.getModel().displayModel.getTileSize(), 1f,
                this.mapView.getModel().frameBufferModel.getOverdrawFactor());

        // tile renderer layer using internal render theme
        File file = createFileFromInputStream();
        MapDataStore mapDataStore = new MapFile(file);
        TileRendererLayer tileRendererLayer = new TileRendererLayer(tileCache, mapDataStore,
                this.mapView.getModel().mapViewPosition, AndroidGraphicFactory.INSTANCE);
        tileRendererLayer.setXmlRenderTheme(InternalRenderTheme.OSMARENDER);


        // only once a layer is associated with a mapView the rendering starts
        this.mapView.getLayerManager().getLayers().add(tileRendererLayer);
        mLugars = getPlaces();
        if (mLugars.size() == 1) {
            centerLocation = new LatLong(mLugars.get(0).latitud, mLugars.get(0).longitud);
        }
        this.mapView.setCenter(centerLocation);
        this.mapView.setZoomLevel((byte) 14);
        for (Lugar lugar : mLugars) {
            createPositionMarker(lugar);
        }
    }

    @Override
    protected void onDestroy() {
        this.mapView.destroyAll();
        AndroidGraphicFactory.clearResourceMemoryCache();
        super.onDestroy();
    }
    private File createFileFromInputStream() {

        try{
            File f = new File(getFilesDir() +"/cercado.map");
            if (!f.exists()) {
                InputStream inputStream = getAssets().open("cercado.map");
                OutputStream outputStream = new FileOutputStream(f);
                byte buffer[] = new byte[1024];
                int length = 0;

                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }

                outputStream.close();
                inputStream.close();
            }
            return f;
        }catch (IOException e) {
            //Logging exception
            e.printStackTrace();
        }

        return null;
    }

    public List<Lugar> getPlaces() {
        return ((App) getApplicationContext()).getListLugars();
    }
    private void createPositionMarker(Lugar lugar) {
        TappableMarker positionmarker = new TappableMarker(this, lugar, AndroidGraphicFactory.convertToBitmap(getResources().getDrawable(getResources().
                getIdentifier(lugar.icon_marker, "drawable", getPackageName()))));
        mapView.getLayerManager().
                getLayers().
                add(positionmarker);
        positionmarker.setOnMakerTap(new OnMarkerTapListener() {
            @Override
            public void onClick(Lugar lugar) {
                Toast.makeText(Mapa.this, lugar.name, Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                ((App)getApplicationContext()).setLugarToShow(lugar);
                //bundle.putSerializable("lugar", new PlaceWrapperForBinder(lugar));
                Intent intent = new Intent(getApplicationContext(), MostrarInfo_Lugar_.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    class TappableMarker extends Marker {

        Context cntx;
        OnMarkerTapListener mListener;
        Lugar mLugar;

        public TappableMarker(Context cntx, Lugar lugar, Bitmap mark) {
            super(new LatLong(lugar.latitud, lugar.longitud),mark ,0 , -mark.getHeight()/2);
            this.cntx = cntx;
            this.mLugar = lugar;
        }

        /**
         * Calcula que estemos haciendo click en la imagen y no en todo la capa
         * @param tapLatLong
         * @param layerXY
         * @param tapXY
         * @return
         */
        @Override
        public boolean onTap(LatLong tapLatLong, Point layerXY, Point tapXY) {

            double centerX = layerXY.x + getHorizontalOffset();
            double centerY = layerXY.y + getVerticalOffset();

            double radiusX = (getBitmap().getWidth() / 2) *1.1;
            double radiusY = (getBitmap().getHeight() / 2) *1.1;

            double distX = Math.abs(centerX - tapXY.x);
            double distY = Math.abs(centerY - tapXY.y);


            if( distX < radiusX && distY < radiusY){
                if (mListener != null) {
                    mListener.onClick(mLugar);
                    return true;
                }
            }
            return false;
        }

        public void setOnMakerTap(OnMarkerTapListener listener) {
            this.mListener = listener;
        }
    }

    interface OnMarkerTapListener {
        void onClick(Lugar lugar);
    }
}
