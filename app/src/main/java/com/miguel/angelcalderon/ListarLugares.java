package com.miguel.angelcalderon;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.miguel.angelcalderon.model.Categoria;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Lugar;
import com.miguel.angelcalderon.query.Query;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.listar_lugares)
public class ListarLugares extends AppCompatActivity{

    private String TAG = "ListarLugares";

    PlaceAdapter placeAdapter;
    RecyclerView recyclerView;
    List<Lugar> lugarArrayList;

    @ViewById(R.id.tb_list_places)
    Toolbar toolbar;

    @AfterViews
    void initialize() {
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        String paramObject = getIntent().getExtras().getString("paramQuery");

        recyclerView = (RecyclerView) findViewById(R.id.rv_list_places);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (paramObject.equals("Boliche")) {
            Log.d(TAG, "Boliche");
            showByCategory(paramObject);
        } else if (paramObject.equals("Restaurante")) {
            Log.d(TAG, "Restaurante");
            showByCategory(paramObject);
        } else if (paramObject.equals("20")) {
            Log.d(TAG, "Veinte");
            showByAmount(paramObject, false);
        } else if (paramObject.equals("50")) {
            showByAmount(paramObject, false);
        } else if (paramObject.equals(">100")) {
            showByAmount("100", true);
        }
    }

    private void showByCategory(String paramObject) {
        lugarArrayList = new ArrayList<>();
        Query getDataCategory = new Query();
        List<Categoria> categories = getDataCategory.getCategory(paramObject);
        for (int i = 0; i<=categories.size(); i++){
            Categoria categoria = categories.get(0);
            Query queryPlace = new Query();
            lugarArrayList = queryPlace.getAllPlace(categoria);
            placeAdapter = new PlaceAdapter(this, lugarArrayList);
            recyclerView.setAdapter(placeAdapter);
        }
    }

    private void showByAmount(String paramAmount, boolean upper) {
        lugarArrayList = new ArrayList<>();
        List<Item> items = upper ? new Query().getAllPlaceByAmountUp(paramAmount)
                : new Query().getAllPlaceByAmount(paramAmount);
        System.out.println(lugarArrayList);
        for (Item item: items) {
            lugarArrayList.add(item.lugar);
            placeAdapter = new PlaceAdapter(this, lugarArrayList);
            recyclerView.setAdapter(placeAdapter);
        }
    }

    /**
     * MARK: A Recycler View Adapter containing a simple custom.
     */
    public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.CustomViewHolder> {

        CustomViewHolder customViewHolder;
        Context context;

        List<Lugar> listLugars;

        public class CustomViewHolder extends RecyclerView.ViewHolder {

            CardView cardView_Place;
            TextView textView_Place_Title;
            TextView textView_Place_Phone;
            TextView textView_Place_Address;
            ImageView imageView_Place_Icon;

            public CustomViewHolder(View view) {
                super(view);
                cardView_Place = (CardView) view.findViewById(R.id.cv_place);
                textView_Place_Title = (TextView) view.findViewById(R.id.tv_title_place);
                textView_Place_Phone = (TextView) view.findViewById(R.id.tv_phone_place);
                textView_Place_Address = (TextView) view.findViewById(R.id.tv_address_place);
                imageView_Place_Icon = (ImageView) view.findViewById(R.id.iv_icon_place);
            }
        }

        public PlaceAdapter(Context paramContext, List<Lugar> paramLugars) {
            context = paramContext;
            listLugars = paramLugars;
        }

        public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lugar_celda, viewGroup, false);

            customViewHolder = new CustomViewHolder(view);
            return customViewHolder;
        }

        @Override
        public int getItemCount() {
            return listLugars.size();
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, final int position) {
            final Lugar lugar = listLugars.get(position);

            holder.imageView_Place_Icon.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(lugar.icon, "drawable", getPackageName())));
            holder.textView_Place_Title.setText(lugar.name);
            holder.textView_Place_Phone.setText("telf: " + lugar.Phone);
            holder.textView_Place_Address.setText(lugar.address);

            holder.cardView_Place.setOnClickListener(new View.OnClickListener() {
                @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
                @Override
                public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    ((App)getApplicationContext()).setLugarToShow(lugar);
                    //bundle.putSerializable("lugar", new PlaceWrapperForBinder(lugar));
                    Intent intent = new Intent(getApplicationContext(), MostrarInfoLugar_.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
        }
    }
}