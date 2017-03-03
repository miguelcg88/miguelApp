package com.miguel.angelcalderon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;

@Fullscreen
@EActivity(R.layout.money)
public class Money extends AppCompatActivity {

    private static String TAG = "Money";

    @ViewById(R.id.tb_money)
    Toolbar toolbar;

    @Click
    void btn_price_twenty() {
        Log.d(TAG, "Btn pressed 20");
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "20");
        startActivity(intent);
    }

    /*@Click
    void btn_price_forty() {
        Log.d(TAG, "Btn pressed 40");
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "40");
        startActivity(intent);
    } */
    /* revisar query */
    @Click
    void btn_price_fifty() {
        Log.d(TAG, "Btn pressed 50");
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "60");
        startActivity(intent);
    }
    /*
    @Click
    void btn_price_eighty() {
        Log.d(TAG, "Btn pressed 80");
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "80");
        startActivity(intent);
    } */

    @Click
    void btn_unlimited_price() {
        Log.d(TAG, "Btn pressed Unlimited");
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "Unlimited");
        startActivity(intent);
    }

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

    }

}
