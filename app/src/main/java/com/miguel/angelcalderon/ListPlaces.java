package com.miguel.angelcalderon;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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

import com.miguel.angelcalderon.model.Category;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Place;
import com.miguel.angelcalderon.query.PlaceWrapperForBinder;
import com.miguel.angelcalderon.query.Query;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.listplaces)
public class ListPlaces extends AppCompatActivity{

    private String TAG = "ListPlaces";

    PlaceAdapter placeAdapter;
    RecyclerView recyclerView;
    List<Place> placeArrayList;

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
            showByAmount(paramObject);
        } else if (paramObject.equals("40")) {
            Log.d(TAG, "Cuarenta");
            showByAmount(paramObject);
        } else if (paramObject.equals("60")) {
            showByAmount(paramObject);
        } else if (paramObject.equals("80")) {
            showByAmount(paramObject);
        } else if (paramObject.equals("Unlimited")) {
            Log.d(TAG, "Unlimited");
            showRandom();
        } else if (paramObject.equals("help-me")) {
            Log.d(TAG, "Help Me");
            showRandom();
        }
    }

    private void showRandom() {
        placeArrayList = new ArrayList<>();
        Query queryPlace = new Query();
        placeArrayList = queryPlace.getAllPlaceSort();
        placeAdapter = new PlaceAdapter(this, placeArrayList);
        recyclerView.setAdapter(placeAdapter);
    }

    private void showByCategory(String paramObject) {
        placeArrayList = new ArrayList<>();
        Query getDataCategory = new Query();
        List<Category> categories = getDataCategory.getCategory(paramObject);
        for (int i = 0; i<=categories.size(); i++){
            Category category = categories.get(0);
            Query queryPlace = new Query();
            placeArrayList = queryPlace.getAllPlace(category);
            placeAdapter = new PlaceAdapter(this, placeArrayList);
            recyclerView.setAdapter(placeAdapter);
        }
    }

    private void showByAmount(String paramAmount) {
        placeArrayList = new ArrayList<>();
        List<Item> items = new Query().getAllPlaceByAmount(paramAmount);
        System.out.println(placeArrayList);
        for (Item item: items) {
            placeArrayList.add(item.place);
            placeAdapter = new PlaceAdapter(this, placeArrayList);
            recyclerView.setAdapter(placeAdapter);
        }
    }

    /**
     * MARK: A Recycler View Adapter containing a simple custom.
     */
    public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.CustomViewHolder> {

        CustomViewHolder customViewHolder;
        Context context;

        List<Place> listPlaces;

        public class CustomViewHolder extends RecyclerView.ViewHolder {

            CardView cardView_Place;
            TextView textView_Place_Title;
            TextView textView_Place_Phone;
            TextView textView_Place_Address;
            ImageView imageView_Place_Icon;
            ImageView imageView_Place_Facebook;
            ImageView imageView_Place_Web;

            public CustomViewHolder(View view) {
                super(view);
                cardView_Place = (CardView) view.findViewById(R.id.cv_place);
                textView_Place_Title = (TextView) view.findViewById(R.id.tv_title_place);
                textView_Place_Phone = (TextView) view.findViewById(R.id.tv_phone_place);
                textView_Place_Address = (TextView) view.findViewById(R.id.tv_address_place);
                imageView_Place_Icon = (ImageView) view.findViewById(R.id.iv_icon_place);
                imageView_Place_Facebook = (ImageView) view.findViewById(R.id.iv_icon_place_facebook);
                imageView_Place_Web = (ImageView) view.findViewById(R.id.iv_icon_place_web);
            }
        }

        public PlaceAdapter(Context paramContext, List<Place> paramPlaces) {
            context = paramContext;
            listPlaces = paramPlaces;
        }

        public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_cell, viewGroup, false);

            customViewHolder = new CustomViewHolder(view);
            return customViewHolder;
        }

        @Override
        public int getItemCount() {
            return listPlaces.size();
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, final int position) {
            final Place place = listPlaces.get(position);

            holder.imageView_Place_Icon.setImageDrawable(getDrawable(getResources().getIdentifier(place.icon, "drawable", getPackageName())));
            holder.textView_Place_Title.setText(place.name);
            holder.textView_Place_Phone.setText("telf: " + place.Phone);
            holder.textView_Place_Address.setText(place.address);

            holder.imageView_Place_Facebook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(place.facebook)));
                }
            });

            holder.imageView_Place_Web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(place.web)));
                }
            });

            holder.cardView_Place.setOnClickListener(new View.OnClickListener() {
                @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
                @Override
                public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    bundle.putBinder("place", new PlaceWrapperForBinder(place));
                    Intent intent = new Intent(getApplicationContext(), MoreInfo_.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
        }
    }
}
