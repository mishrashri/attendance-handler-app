package com.example.attendancehandlerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    ImageView splashimg;
    LottieAnimationView lottieAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        splashimg=findViewById(R.id.img);
        lottieAnimation=findViewById(R.id.lottie);


        splashimg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        lottieAnimation.animate().translationY(1400).setDuration(2000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {

            public void run() {
                startActivity(new Intent(SplashScreen.this, com.example.attendancehandlerapp.MainActivity.class));
                finish();
            }

        }, 5000);
    }
}