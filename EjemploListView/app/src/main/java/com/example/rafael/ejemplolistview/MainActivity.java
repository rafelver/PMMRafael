package com.example.rafael.ejemplolistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

             //Definimos El array de Strings
        //Los Datos
        String[] sistemasOperativos = new String[] { "Android", "Ubuntu" , "Fedora", "Mac Os X",
                "Windows 7", "Windows 8", "Windows XP","Windows XP", "Ubuntu",
                "Windows 7", "Windows 8", "WindowsMobile","Windows XP", "Ubuntu","Android", "Ubuntu"
                , "Fedora" , "Windows 8", "Windows XP", "Windows XP", "Windows 7","Android", "Ubuntu"
                , "Fedora" , "Windows 8", "WindowsMobile","Linux", "Windows 7","Android", "Ubuntu"};

        //convertimos la lista en un ArrayList
        ArrayList<String> listaSO = new ArrayList<String>(Arrays.asList(sistemasOperativos));

        //Enchufamos la lista al adaptador
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listaSO);

        //Utilizamos nuestro adaptador customizado
        MenuAdapter adapter = new MenuAdapter(this,listaSO);

        //enchufamos el adaptador a la vista que es un listView
        //la Vision o Iterfaz
        final ListView listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);

        //Interactuando (inerclass)
        listview.setOnItemClickListener(new nuestroListener());

    }

    private class nuestroListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           //String de la posicion clickada
            String item = (String) parent.getItemAtPosition(position);

            //Toast.makeText(MainActivity.this,item,Toast.LENGTH_SHORT).show();


            //Paso de informacion
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("so", item);
            startActivity(intent);
        }
    }

}
