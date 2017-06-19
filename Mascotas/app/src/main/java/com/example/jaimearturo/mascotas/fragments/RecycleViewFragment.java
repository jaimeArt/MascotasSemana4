package com.example.jaimearturo.mascotas.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jaimearturo.mascotas.R;
import com.example.jaimearturo.mascotas.adapter.MascotaAdapter;
import com.example.jaimearturo.mascotas.poyo.Mascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleViewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMasotas;
    public RecycleViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_recycle_view, container, false);
        listaMasotas =(RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager lim = new LinearLayoutManager(getActivity());
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        listaMasotas.setLayoutManager(lim);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }
    public void inicializarAdaptador()
    {
        MascotaAdapter adaptador = new MascotaAdapter(mascotas); //, getActivity()
        listaMasotas.setAdapter(adaptador);

    }
    public void inicializarListaMascotas()
    {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.conejo, "Max", "9"));
        mascotas.add(new Mascota(R.drawable.gato, "Tomas", "10"));
        mascotas.add(new Mascota(R.drawable.hamster, "Flor", "2"));
        mascotas.add(new Mascota(R.drawable.loro, "Roberto", "5"));
        mascotas.add(new Mascota(R.drawable.perro, "Nicky", "15"));
    }
}
