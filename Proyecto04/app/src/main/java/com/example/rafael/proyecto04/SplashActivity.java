package com.example.rafael.proyecto04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {


    //Este es el Timer
    private long SPLASH_DELAY = 4000; //4 segundos



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //Cargamos la Activity2 MainActivity
                Intent mainIntent = new Intent(getApplicationContext(), MenuActivity.class);
                //cargamos
                startActivity(mainIntent);
                finish();

            }

        };

        Timer timer = new Timer(); timer.schedule(task, SPLASH_DELAY);


    }
}
