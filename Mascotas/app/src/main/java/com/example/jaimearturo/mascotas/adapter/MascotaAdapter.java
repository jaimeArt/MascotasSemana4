package com.example.jaimearturo.mascotas.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jaimearturo.mascotas.poyo.Mascota;
import com.example.jaimearturo.mascotas.R;

import java.util.ArrayList;

/**
 * Created by JaimeArturo on 10/06/2017.
 */

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>
{
    ArrayList<Mascota> mascotas;

    public MascotaAdapter(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imFoto.setImageResource(mascota.getFotoMascota());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombreMascota());
        mascotaViewHolder.tvLikeMascota.setText(mascota.getLikeMascota());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imFoto;
        private TextView tvNombreMascota;
        private TextView tvLikeMascota;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imFoto = (ImageView) itemView.findViewById(R.id.imImagenMascota);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvLikeMascota = (TextView) itemView.findViewById(R.id.tvLikeMascota);
        }
    }
}
