package com.miguel.angelcalderon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;

@Fullscreen
@EActivity(R.layout.take)
public class Take extends AppCompatActivity {

    @ViewById(R.id.tb_take)
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
    }

    @Click
    void btn_take_club() {
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "Boliche");
        startActivity(intent);
    }

    @Click
    void btn_take_restaurant() {
        Intent intent = new Intent(this, ListPlaces_.class);
        intent.putExtra("paramQuery", "Restaurante");
        startActivity(intent);
    }

}
