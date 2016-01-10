package com.miguel.angelcalderon;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.miguel.angelcalderon.model.Image;
import com.miguel.angelcalderon.model.Place;
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

        String paramGetId = getIntent().getStringExtra("paramQueryPlace");

        System.out.println(paramGetId);

        Query queryPlace = new Query();

        List<Place> place = queryPlace.getPlace(paramGetId);

        for (Place name: place) {

            textViewName.setText(name.name);
            textViewPhone.setText(name.Phone);
            textViewAddress.setText(name.address);
            textViewSchedule_day.setText(name.schedule_day);
            textViewSchedule_hours.setText(name.schedule_hour);
            textViewWeb.setText(name.web);

            Query queryImage = new Query();
            List<Image> imageList = queryImage.getAllImage(paramGetId);

            HashMap<String, Integer> url_maps = new HashMap<>();

            for (Image image: imageList) {

                System.out.println(image.name);

                url_maps.put(" ", ((int) (getResources().getIdentifier(image.name, "drawable", getPackageName()))));

                for(String name_slider : url_maps.keySet()){
                    TextSliderView textSliderView = new TextSliderView(this);
                    // initialize a SliderLayout
                    textSliderView
                            .description(name_slider)
                            .image(url_maps.get(name_slider))
                            .setScaleType(BaseSliderView.ScaleType.Fit);

                    /*//add your extra information
                    textSliderView.bundle(new Bundle());
                    textSliderView.getBundle()
                            .putString("extra",name_slider);*/
                    sliderLayout.addSlider(textSliderView);
                }
            }

            sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
            sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
            sliderLayout.setCustomAnimation(new DescriptionAnimation());
            sliderLayout.setDuration(5000);

        }





        /*url_maps.put("Churrasco italiano 40 Bs", R.drawable.panchita_burguer);
        url_maps.put("Hamburguesa Mixta 15 Bs", R.drawable.panchita_cabinitas);
*/

    }


}
