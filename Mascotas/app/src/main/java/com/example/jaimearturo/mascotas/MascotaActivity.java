package com.example.jaimearturo.mascotas;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.jaimearturo.mascotas.adapter.MascotaAdapter;
import com.example.jaimearturo.mascotas.poyo.Mascota;

import java.util.ArrayList;

public class MascotaActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMasotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 /*       getActionBar().setHomeButtonEnabled(true);
        */




        listaMasotas =(RecyclerView)findViewById(R.id.rvMascotas);
        LinearLayoutManager lim = new LinearLayoutManager(this);
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        listaMasotas.setLayoutManager(lim);
        inicializarListaMascotas();
        inicializarAdaptador();
    }
    public void irMascota(View v)
    {
        NavUtils.navigateUpFromSameTask(this);
/*        Intent intentMascota = new Intent(this, MainActivity.class);
        startActivity(intentMascota);*/
    }
    public void inicializarAdaptador()
    {
        MascotaAdapter adaptador = new MascotaAdapter(mascotas);
        listaMasotas.setAdapter(adaptador);

    }
    public void inicializarListaMascotas()
    {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.conejo, "Max", "9"));
        mascotas.add(new Mascota(R.drawable.gato, "Tomas", "10"));
        mascotas.add(new Mascota(R.drawable.perro, "Nicky", "15"));
    }
}
