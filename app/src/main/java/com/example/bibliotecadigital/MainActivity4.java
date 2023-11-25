package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    RecyclerView miRecyclerView;
    RecyclerView.LayoutManager miLayoutManager;
    RecyclerView.Adapter miAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //RECYCLER VIEW
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        miRecyclerView = findViewById(R.id.miRecycler);

        miLayoutManager = new GridLayoutManager(this, 2);
        miRecyclerView.setLayoutManager(miLayoutManager);

        String[] datos = {"INFILTRADO", "MI VIAJE SIN TI", "1 CHISTE POR DIA", "PROYECTO KARON","QUINTA ESTACION"};
        miAdaptador = new Adaptador(datos);
        miRecyclerView.setAdapter(miAdaptador);



        TextView tvDescargar = findViewById(R.id.tvDescargar);
        tvDescargar.setText("ESTAS ESTAS EN LA SECCION DE DESCARGAR");

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

    public boolean onOptionsItemSelected(MenuItem item) {


        switch ((String) item.getTitle()) {
            case "Buscar":
                startActivity(new Intent(this, MainActivity3.class));
                return true;
            case "Descargar":
                startActivity(new Intent(this, MainActivity4.class));
                return true;
            case "Inicio":
                startActivity(new Intent(this, MainActivity2.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}