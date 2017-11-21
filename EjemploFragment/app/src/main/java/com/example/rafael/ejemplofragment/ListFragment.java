package com.example.rafael.ejemplofragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;



public class ListFragment extends Fragment {


    public  ListFragment () {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    public void onActivityCreated (Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,listaSO);

        //Utilizamos nuestro adaptador customizado
        //MenuAdapter adapter = new MenuAdapter(this,listaSO);

        //enchufamos el adaptador a la vista que es un listView
        //la Vision o Iterfaz
        final ListView listview = (ListView) getActivity().findViewById(R.id.listview);
        listview.setAdapter(adapter);

        //Interactuando (inerclass)
        //listview.setOnItemClickListener(new nuestroListener());


    }

        @Override
    public void onDetach() {
        super.onDetach();

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
