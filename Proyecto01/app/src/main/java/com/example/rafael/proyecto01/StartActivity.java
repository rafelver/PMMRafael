package com.example.rafael.proyecto01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends Activity {

    //Este es el Timer
    private long SPLASH_DELAY = 6000; //6 segundos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //Cargamos la Activity2 MainActivity
                Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                //cargamos
                startActivity(mainIntent);
                finish();

            }

        };

        Timer timer = new Timer(); timer.schedule(task, SPLASH_DELAY);
        }

    }

