package com.example.rafael.proyecto03;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class MenuAdapter extends ArrayAdapter<String>{
    private Context context;
    private ArrayList<String> datos;

    public MenuAdapter(Context context,  ArrayList<String> datos) {
        super(context, 0, datos);
        this.context=context;
        this.datos=datos;
    }

    public View getView (int position, View convertView , ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)context.getSystemService
                (context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            convertView=inflater.inflate(R.layout.item_menu,parent,false);
        }
        ImageView imagen= (ImageView) convertView.findViewById(R.id.imageView2);
        TextView texto= (TextView) convertView.findViewById(R.id.textView);

        texto.setText(datos.get(position));

        switch (position){
            case 0:
                imagen.setImageDrawable(context.getDrawable(R.drawable.ic_perm_identity_black_24dp));
                texto.setBackgroundColor(Color.LTGRAY);
                imagen.setBackgroundColor(Color.MAGENTA);
                break;
            case 1:
                imagen.setImageDrawable(context.getDrawable(R.drawable.ic_account_box_black_24dp));
                texto.setBackgroundColor(Color.GRAY);
                imagen.setBackgroundColor(Color.CYAN);
                break;
            case 2:
                imagen.setImageDrawable(context.getDrawable(R.drawable.ic_android_black_24dp));
                texto.setBackgroundColor(Color.LTGRAY);
                imagen.setBackgroundColor(Color.MAGENTA);
                break;
            case 3:
                imagen.setImageDrawable(context.getDrawable(R.drawable.ic_build_black_24dp));
                texto.setBackgroundColor(Color.GRAY);
                imagen.setBackgroundColor(Color.CYAN);
                break;
            default:
                imagen.setImageDrawable(context.getDrawable(R.drawable.ic_perm_identity_black_24dp));
                break;
        }

        return convertView;
    }
}
