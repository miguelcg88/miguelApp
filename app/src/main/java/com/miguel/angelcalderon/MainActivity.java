package com.miguel.angelcalderon;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;

import com.miguel.angelcalderon.model.Category;
import com.miguel.angelcalderon.model.Place;
import com.miguel.angelcalderon.query.PlaceWrapperForBinder;
import com.miguel.angelcalderon.query.Query;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    @ViewById(R.id.tb_main)
    Toolbar toolbar;

    @AfterViews
    void initialize() {
        setSupportActionBar(toolbar);
       // setStatusBarTranslucent(true);
        toolbar.setPadding(0, getStatusBarHeight(), 0, 0);
        setTitle("");
    }

    @Click
    void btnMenuMoney() {
        Log.d(TAG, "Btn pressed MoneyActivity");
        startActivity(new Intent(this, Money_.class));
    }

    @Click
    void btnMenuLocation() {
        Log.d(TAG, "Btn pressed LocationActivity");
        Query queryPlace = new Query();
        ((App)getApplicationContext()).setListPlaces(queryPlace.getAllPlace());
        startActivity(new Intent(this, Map.class));
    }

    @Click
    void btnMenuMake() {
        Log.d(TAG, "Btn pressed TakeActivity");
        startActivity(new Intent(this, Take_.class));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Click
    void btnMenuHelpMe() {
        Log.d(TAG, "Btn pressed ListPlacesActivity");
        Bundle bundle = new Bundle();
        Place place = new Query().getPlaceRandom();
        bundle.putBinder("place", new PlaceWrapperForBinder(place));
        Intent intent = new Intent(this, MoreInfo_.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    protected void setStatusBarTranslucent(boolean makeTranslucent) {
          if (makeTranslucent) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
