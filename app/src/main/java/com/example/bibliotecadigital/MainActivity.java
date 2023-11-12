package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //PARA VINCULAR EL TOOLBAR
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        myToolbar.setTitle("");
        setSupportActionBar(myToolbar);

    }

    //PARA VINCULAR EL MENU CREADO

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

   /* public void mostrarMensaje1(View view) {
        Intent envioIntent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(envioIntent);
    }

    public void mostrarMensaje2(View view) {
        Intent envioIntent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(envioIntent);
    }*/


}