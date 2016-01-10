package com.miguel.angelcalderon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

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
        startActivity(new Intent(this, Location_.class));
    }

    @Click
    void fab_menu_make() {
        Log.d(TAG, "Btn pressed TakeActivity");
        startActivity(new Intent(this, Take_.class));
    }

    @Click
    void fab_menu_help_me() {
        Log.d(TAG, "Btn pressed ListPlacesActivity");
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "help-me");
        startActivity(intent);
    }
}
