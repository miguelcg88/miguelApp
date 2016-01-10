package com.miguel.angelcalderon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import java.util.Timer;
import java.util.TimerTask;

@EActivity(R.layout.splashscreen)
public class SplashScreen extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY = 5000;

    @AfterViews
    void init(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent().setClass(SplashScreen.this, MainActivity_.class);
                startActivity(mainIntent);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}
