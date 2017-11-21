package com.example.rafael.ejemplolistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String item = intent.getStringExtra("so");
        Toast.makeText(Main2Activity.this,item,Toast.LENGTH_SHORT).show();
    }
}
