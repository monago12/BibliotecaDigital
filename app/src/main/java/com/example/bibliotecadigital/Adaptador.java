package com.example.bibliotecadigital;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MiViewHolder> {
    private String[] misDatos;


    public Adaptador(String[] datos) {
        misDatos = datos;
    }


    public class MiViewHolder extends RecyclerView.ViewHolder {
        TextView tvDias;
        TextView tvAutor;
        TextView tvGenero;
        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDias = itemView.findViewById(R.id.tvItem);
            tvAutor = itemView.findViewById(R.id.tvItem1);
            tvGenero = itemView.findViewById(R.id.tvItem2);
        }
    }

    @NonNull
    @Override
    public Adaptador.MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("ResourceType")
        View miVista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista, parent, false);
        MiViewHolder miViewHolder = new MiViewHolder(miVista);
        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.MiViewHolder miHolder, int position) {
        miHolder.tvDias.setText(misDatos[position]);
        miHolder.tvAutor.setText(misDatos[position]);
        miHolder.tvGenero.setText(misDatos[position]);
    }

    @Override
    public int getItemCount() {
        return misDatos.length;
    }
}
