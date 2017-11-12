package com.example.rafael.ejemplointent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //SE Genera el listener del primer boton
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            //Vamos a programar la llamada a la segunda Ventana
                Intent llamada = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(llamada);


            }
        });


        //SE Genera el listener del segundo boton
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Vamos a programar la llamada a maps
                Uri direccion= Uri.parse("geo:0,0?q=Aldaya");
                Intent llamada = new Intent(Intent.ACTION_VIEW, direccion);
                startActivity(llamada);


            }
        });

    }
}
