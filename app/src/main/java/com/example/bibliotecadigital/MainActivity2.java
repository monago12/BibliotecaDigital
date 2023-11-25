package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



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

