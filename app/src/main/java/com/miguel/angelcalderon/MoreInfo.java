package com.miguel.angelcalderon;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.miguel.angelcalderon.model.Item;
import com.miguel.angelcalderon.model.Place;
import com.miguel.angelcalderon.query.PlaceWrapperForBinder;
import com.miguel.angelcalderon.query.Query;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.HashMap;
import java.util.List;

@EActivity(R.layout.more_info)
public class MoreInfo extends AppCompatActivity {

    @ViewById(R.id.slider)
    SliderLayout sliderLayout;

    @ViewById(R.id.tb_more_info)
    Toolbar toolbar;

    @ViewById(R.id.tv_more_info_name)
    TextView textViewName;

    @ViewById(R.id.tv_more_info_phone)
    TextView textViewPhone;

    @ViewById(R.id.tv_more_info_address)
    TextView textViewAddress;

    @ViewById(R.id.tv_more_info_schedule_day)
    TextView textViewSchedule_day;

    @ViewById(R.id.tv_more_info_schedule_hours)
    TextView textViewSchedule_hours;

    @ViewById(R.id.tv_more_info_web)
    TextView textViewWeb;

    Place place;

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

        assert ((PlaceWrapperForBinder) getIntent().getExtras().getBinder("place")) != null;
        place = ((PlaceWrapperForBinder) getIntent().getExtras().getBinder("place")).getPlace();
        String paramGetId = getIntent().getStringExtra("paramQueryPlace");

        textViewName.setText(place.name);
        textViewPhone.setText(place.Phone);
        textViewAddress.setText(place.address);
        textViewSchedule_day.setText(place.schedule_day);
        textViewSchedule_hours.setText(place.schedule_hour);
        textViewWeb.setText(place.web);

        Query queryImage = new Query();
        List<Item> itemList = queryImage.getAllItemByPlace(place);

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

    }


}
