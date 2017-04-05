package com.miguel.angelcalderon;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.miguel.angelcalderon.model.Category;
import com.miguel.angelcalderon.model.Place;
import com.miguel.angelcalderon.query.PlaceWrapperForBinder;
import com.miguel.angelcalderon.query.Query;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;

@Fullscreen
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    @ViewById(R.id.tb_main)
    Toolbar toolbar;

    @AfterViews
    void initialize() {
        setSupportActionBar(toolbar);
    }

    @Click
    void fab_menu_money() {
        Log.d(TAG, "Btn pressed MoneyActivity");
        startActivity(new Intent(this, Money_.class));
    }

    @Click
    void fab_menu_location() {
        Log.d(TAG, "Btn pressed LocationActivity");
        Query queryPlace = new Query();
        ((App)getApplicationContext()).setListPlaces(queryPlace.getAllPlace());
        startActivity(new Intent(this, Map.class));
    }

    @Click
    void fab_menu_make() {
        Log.d(TAG, "Btn pressed TakeActivity");
        startActivity(new Intent(this, Take_.class));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Click
    void fab_menu_help_me() {
        Log.d(TAG, "Btn pressed ListPlacesActivity");
        Bundle bundle = new Bundle();
        Place place = new Query().getPlaceRandom();
        bundle.putBinder("place", new PlaceWrapperForBinder(place));
        Intent intent = new Intent(this, MoreInfo_.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
