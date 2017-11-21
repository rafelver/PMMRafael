package com.example.rafael.ciudad;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtener el contexto de la activity
        Context contexto=this;
        Log.i("CONTEXT INFO","El contexto de la Activity es:"+contexto);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageDrawable(getResources().getDrawable(R.drawable.valencia,null));

        //Obtener el Contexto dentro de una inner Class
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CONTEXT INFO","El contexto de la Activity dentro de un inner class: "+MainActivity.this);

            }
        });

        //obtener el context a partir de un View
        Log.i("CONTEXT INFO","El contexto de la Activity es:"+image.getContext());

        //obtener el contexto de Aplicacion
        Log.i("CONTEXT INFO","El contexto de la Activity es:"+getApplicationContext());

    }
}
