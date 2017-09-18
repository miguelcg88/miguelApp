package com.miguel.angelcalderon;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Lugar;
import com.miguel.angelcalderon.query.Query;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.HashMap;
import java.util.List;

@EActivity(R.layout.mostrar_info_lugar)
public class MostrarInfoLugar extends AppCompatActivity {

    @ViewById(R.id.slider)
    SliderLayout sliderLayout;

    @ViewById(R.id.tb_more_info)
    Toolbar toolbar;

    @ViewById(R.id.tv_more_info_phone)
    TextView textViewPhone;

    @ViewById(R.id.tv_more_info_address)
    TextView textViewAddress;

    @ViewById(R.id.tv_more_info_schedule_day)
    TextView textViewSchedule_day;

    @ViewById(R.id.tv_more_info_schedule_hours)
    TextView textViewSchedule_hours;

    @ViewById(R.id.txtMoreProd1)
    TextView txtMoreProd1;

    @ViewById(R.id.txtMoreProd2)
    TextView txtMoreProd2;

    @ViewById(R.id.txtMoreProd3)
    TextView txtMoreProd3;

    @ViewById(R.id.txtProd1Price)
    TextView txtProd1Price;

    @ViewById(R.id.txtProd2Price)
    TextView txtProd2Price;

    @ViewById(R.id.txtProd3Price)
    TextView txtProd3Price;

    @ViewById(R.id.imgOption1)
    ImageView imgOption1;

    @ViewById(R.id.imgOption2)
    ImageView imgOption2;

    @ViewById(R.id.imgOption3)
    ImageView imgOption3;

    @ViewById(R.id.imgBtnUrl)
    ImageButton imgBtnUrl;

    @ViewById(R.id.imgBtnFacebook)
    ImageButton imgBtnFacebook;

    @ViewById(R.id.imgBtnLocation)
    ImageButton imgBtnLocation;
    Lugar lugar;

    @ViewById(R.id.imgBtnRate)
    ImageButton imgBtnRate;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
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

        //assert ((PlaceWrapperForBinder) getIntent().getExtras().getSerializable("lugar")) != null;
        //lugar = ((PlaceWrapperForBinder) getIntent().getExtras().getSerializable("lugar")).getPlace();
        lugar = ((App)getApplicationContext()).getLugarToShow();

        setTitle(lugar.name);
        textViewPhone.setText(lugar.Phone);
        textViewAddress.setText(lugar.address);
        textViewSchedule_day.setText(lugar.schedule_day);
        textViewSchedule_hours.setText(lugar.schedule_hour);

        Query queryImage = new Query();
        List<Item> itemList = queryImage.getAllItemByPlace(lugar);

        HashMap<String, Integer> url_maps = new HashMap<>();
        for (Item item : itemList) {

            System.out.println(item.image);

            url_maps.put(item.name + " " + item.price + " Bs", ((int) (getResources().getIdentifier(item.image, "drawable", getPackageName()))));

            for(String name_slider : url_maps.keySet()){
                TextSliderView textSliderView = new TextSliderView(this);

                textSliderView
                        .description(name_slider)
                        .image(url_maps.get(name_slider))
                        .setScaleType(BaseSliderView.ScaleType.Fit);

                sliderLayout.addSlider(textSliderView);
            }
        }

        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(5000);

        imgBtnFacebook.setImageResource(R.drawable.ic_facebook1);
        imgBtnLocation.setImageResource(R.drawable.ic_location1);
        imgBtnUrl.setImageResource(R.drawable.ic_earth1);
        imgBtnRate.setImageResource(R.drawable.ic_rate);

        if (lugar.categoria.name.equals(App.STATIC_CLUB)) {
            txtMoreProd1.setText(lugar.activity1);
            txtMoreProd2.setText(lugar.activity2);
            txtMoreProd3.setText(lugar.activity3);
            txtProd1Price.setVisibility(View.GONE);
            txtProd2Price.setVisibility(View.GONE);
            txtProd3Price.setVisibility(View.GONE);
            imgOption1.setImageResource(R.drawable.ic_music);
            imgOption2.setImageResource(R.drawable.ic_money);
            imgOption3.setImageResource(R.drawable.ic_champagne1);
        } else {
            if (itemList.size() > 0) {
                txtMoreProd1.setText(itemList.get(0).name);
                txtMoreProd2.setText(itemList.get(1).name);
                txtMoreProd3.setText(itemList.get(2).name);
                txtProd1Price.setText(itemList.get(0).price + " Bs");
                txtProd2Price.setText(itemList.get(1).price + " Bs");
                txtProd3Price.setText(itemList.get(2).price + " Bs");
                imgOption1.setImageResource(R.drawable.ic_dishes1);
                imgOption2.setImageResource(R.drawable.ic_dishes1);
                imgOption3.setImageResource(R.drawable.ic_dishes1);
            }
        }

    }

    @Click
    void imgBtnUrl() {
        if (!TextUtils.isEmpty(lugar.web)) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse(lugar.web));
        startActivity(browserIntent);
        } else {
            Toast.makeText(this, "Este lugar no cuenta con pagina web", Toast.LENGTH_SHORT).show();
        }
    }

    @Click
    void imgBtnFacebook() {
        if (!TextUtils.isEmpty(lugar.facebook)) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(lugar.facebook));
            startActivity(browserIntent);
        } else {
            Toast.makeText(this, "Este lugar no cuenta con fan page", Toast.LENGTH_SHORT).show();
        }
    }
    @Click
    void imgBtnLocation() {
        Uri intentUri = Uri.parse("geo:0,0?q=" + lugar.latitud + ","+ lugar.longitud + "(" + lugar.name + ")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if(mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else
            Toast.makeText(this, "Por favor instala Google Maps para ver la direccion", Toast.LENGTH_SHORT).show();
    }
    @Click
    void imgBtnRate() {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse(lugar.web));
        startActivity(browserIntent);
    }
}
