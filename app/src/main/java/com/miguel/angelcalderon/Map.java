package com.miguel.angelcalderon;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.model.LatLong;
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

public class Map extends Activity {
    private static final String LIST_PLACES = "places";

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidGraphicFactory.createInstance(this.getApplication());

        this.mapView = new MapView(this);
        setContentView(this.mapView);

        this.mapView.setClickable(true);
        this.mapView.getMapScaleBar().setVisible(true);
        this.mapView.setBuiltInZoomControls(true);
        this.mapView.setZoomLevelMin((byte) 14);
        this.mapView.setZoomLevelMax((byte) 19);

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

        this.mapView.setCenter(new LatLong(-17.392523, -66.158852));
        this.mapView.setZoomLevel((byte) 14);
        createPositionMarker(-17.392523, -66.158852);

    }

    @Override
    protected void onDestroy() {
        this.mapView.destroyAll();
        AndroidGraphicFactory.clearResourceMemoryCache();
        super.onDestroy();
    }
    private File createFileFromInputStream() {

        try{
            InputStream inputStream = getAssets().open("cercado.map");
            File f = new File(getFilesDir() +"/cercado.map");
            OutputStream outputStream = new FileOutputStream(f);
            byte buffer[] = new byte[1024];
            int length = 0;

            while((length=inputStream.read(buffer)) > 0) {
                outputStream.write(buffer,0,length);
            }

            outputStream.close();
            inputStream.close();

            return f;
        }catch (IOException e) {
            //Logging exception
            e.printStackTrace();
        }

        return null;
    }

    private void createPositionMarker(double paramDouble1, double paramDouble2) {

        final LatLong localLatLong = new LatLong(paramDouble1, paramDouble2);
        TappableMarker positionmarker = new TappableMarker(localLatLong, AndroidGraphicFactory.convertToBitmap(Map.this.getApplicationContext().getResources().getDrawable(R.drawable.marker_green)));
        mapView.getLayerManager().
                getLayers().
                add(positionmarker);
        positionmarker.requestRedraw();
    }

    class TappableMarker extends Marker {
        public TappableMarker(LatLong localLatLong, Bitmap mark) {
            super(localLatLong,mark ,0, -mark.getHeight()/2);

        }
    }
}
