package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tvBuscar = findViewById(R.id.tvBuscar);
        tvBuscar.setText("Abriste la opcion de BUSCAR");

    }
}