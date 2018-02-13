package com.example.rafael.proyecto04;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class MenuFragment extends Fragment {

    MenuFragmentListener mCallback;

    // private OnFragmentInteractionListener mListener;

    public interface MenuFragmentListener {
        public void onListSelected(int position,String item);
    }



    public MenuFragment() {

    }




    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    // public void onButtonPressed(Uri uri) {
    //     if (mListener != null) {
    //         mListener.onFragmentInteraction(uri);
    //     }
    //  }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallback = (MenuFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement MenuFragmentListener");
        }


    }

    public void onActivityCreated (Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        //Datos
        //En primer lugar definimos un array de Strings y lo convertimos a una lista en este caso ArrayList
        String [] opcionesMenu = new String [] { "PERFIL", "JUEGO", "INSTRUCCIONES", "INFORMACION" };

        ArrayList<String> listaMenu = new ArrayList<String>(Arrays.asList(opcionesMenu));

        //En segundo lugar enchufamos la lista al Adaptador
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaSO);

        //Utilizamos nuestro adapter customizado
        MenuAdapter adapter = new MenuAdapter(getActivity(),listaMenu);

        //Interfaz o la Vision
        //Por ultimos enchufamos el adaptador a la vista que es el ListView
        final ListView listView = (ListView) getActivity().findViewById(R.id.listview);
        listView.setAdapter(adapter);


        //Interactuando
        listView.setOnItemClickListener(new nuestroListener());

    }

    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }

    private class nuestroListener implements AdapterView.OnItemClickListener{
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // String de la posicion clickada
            String item = (String) parent.getItemAtPosition(position);

            //paso de Informacion
            mCallback.onListSelected(position,item);

        }
    }



    //  public interface OnFragmentInteractionListener {
    // TODO: Update argument type and name
    //      void onFragmentInteraction(Uri uri);
    //  }
}
