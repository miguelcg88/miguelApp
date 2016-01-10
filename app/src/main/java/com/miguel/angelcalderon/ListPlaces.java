package com.miguel.angelcalderon;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.miguel.angelcalderon.model.InfoRestaurant;
import com.miguel.angelcalderon.model.Place;
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
    ArrayList<Place> placeArrayList = null;

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
        Log.d(TAG, "Selecciono : " + paramObject);

        if (paramObject.equals("Boliche")) {
            placeArrayList = new ArrayList<>();

            Query getDataCategory = new Query();
            List<Category> categories = getDataCategory.getCategory(paramObject);
            for (int i = 0; i<=categories.size(); i++){
                Category category = categories.get(0);

                Query queryPlace = new Query();
                placeArrayList = (ArrayList<Place>) queryPlace.getAllPlace(category);

            }

        } else if (paramObject.equals("Restaurante")) {

            placeArrayList = new ArrayList<>();
            Category category = new Category();
            Query getDataCategory = new Query();
            List<Category> categories = getDataCategory.getCategory(paramObject);

            System.out.println(categories.size());
            for (int i = 0; i<=categories.size(); i++){
                category = categories.get(0);
            }

            Query queryPlace = new Query();
            placeArrayList = (ArrayList<Place>) queryPlace.getAllPlace(category);
            System.out.println(placeArrayList);

        } else if (paramObject.equals("20")) {

            Log.d(TAG, "Veinte");
            placeArrayList = new ArrayList<>();
            Query queryTwenty = new Query();
            List<InfoRestaurant> infoRestaurants = queryTwenty.getAllPlaceTwenty(paramObject);

            for (InfoRestaurant infoRestaurant: infoRestaurants) {
                Log.d(TAG, infoRestaurant.place);
            }

        } else if (paramObject.equals("40")) {

            Log.d(TAG, "Cuarenta");

        } else if (paramObject.equals("60")) {

            Log.d(TAG, "Sesenta");

        } else if (paramObject.equals("80")) {

            Log.d(TAG, "Ochenta");

        } else if (paramObject.equals("Unlimited")) {

            Log.d(TAG, "Unlimited");
            placeArrayList = new ArrayList<>();

            Query queryPlace = new Query();
            placeArrayList = (ArrayList<Place>) queryPlace.getAllPlaceSort();
            System.out.println(placeArrayList);

        } else if (paramObject.equals("help-me")) {
            Log.d(TAG, "Help Me");
            placeArrayList = new ArrayList<>();

            Query queryPlace = new Query();
            placeArrayList = (ArrayList<Place>) queryPlace.getAllPlaceSort();
            System.out.println(placeArrayList);
        }


        recyclerView = (RecyclerView) findViewById(R.id.rv_list_places);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        placeAdapter = new PlaceAdapter(this, placeArrayList);
        recyclerView.setAdapter(placeAdapter);
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
            holder.textView_Place_Phone.setText(place.Phone);
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
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MoreInfo_.class);
                    intent.putExtra("paramQueryPlace", place.name);
                    startActivity(intent);
                }
            });
        }
    }
}
