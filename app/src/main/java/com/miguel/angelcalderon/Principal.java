package com.miguel.angelcalderon;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.miguel.angelcalderon.model.Lugar;
import com.miguel.angelcalderon.query.Query;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.bienvenida)
public class Principal extends AppCompatActivity {

    private static String TAG = "Principal";

    @ViewById(R.id.tb_main)
    Toolbar toolbar;

    @AfterViews
    void initialize() {
        setSupportActionBar(toolbar);
        toolbar.setPadding(0, getStatusBarHeight(), 0, 0);
        setTitle("");
    }

    @Click
    void btnMenuMoney() {
        Log.d(TAG, "Btn pressed MoneyActivity");
        startActivity(new Intent(this, FiltrarPorPrecios_.class));
    }

    @Click
    void btnAbout() {
        showChangeLangDialog();
    }

    @Click
    void btnMenuLocation() {
        Log.d(TAG, "Btn pressed LocationActivity");
        Query queryPlace = new Query();
        ((App)getApplicationContext()).setListLugars(queryPlace.getAllPlace());
        startActivity(new Intent(this, Mapa.class));
    }

    @Click
    void btnMenuMake() {
        Log.d(TAG, "Btn pressed TakeActivity");
        startActivity(new Intent(this, EscogerCategoria_.class));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Click
    void btnMenuHelpMe() {
        Log.d(TAG, "Btn pressed ListPlacesActivity");
        startActivity(new Intent(this, EscogerCategoria_.class));
        Bundle bundle = new Bundle();
        Lugar lugar = new Query().getPlaceRandom();
        ((App)getApplicationContext()).setLugarToShow(lugar);
        //bundle.putSerializable("lugar", new PlaceWrapperForBinder(lugar));
        Intent intent = new Intent(this, MostrarInfoLugar_.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public void showChangeLangDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, android.R.style.Theme_Holo_Dialog_NoActionBar);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.acerca_de, null);
        dialogBuilder.setView(dialogView);
        dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //do something with edt.getText().toString();
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }
}
