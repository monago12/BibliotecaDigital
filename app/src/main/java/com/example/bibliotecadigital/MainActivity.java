package com.example.bibliotecadigital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bibliotecadigital.modelos.Usuario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etUsu, etCon;
    private Button btnIngre;

    private ArrayList<Usuario> listaUsuario;
    private Usuario objUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini();
    }

    public void ini() {
        etUsu = (EditText) findViewById(R.id.etUsuario);
        etCon = (EditText) findViewById(R.id.etContraseña);
        btnIngre = (Button) findViewById(R.id.btIngresar);
        btnIngre.setOnClickListener(this);
    }

    private void llenarUsuarios() {
        listaUsuario = new ArrayList<Usuario>();
        listaUsuario.add(new Usuario("Linder", "linder@gmail.com", "linder123"));
        listaUsuario.add(new Usuario("kriss", "kriss@gmail.com", "kriss123"));

    }

    private void ingresarSesion() {
        llenarUsuarios();
        String correo = etUsu.getText().toString();
        String contraseña = etCon.getText().toString();
        boolean usuarioEncontrado = false;
        for (int i = 0; i < listaUsuario.size(); i++) {
            if (correo.equals(listaUsuario.get(i).getCorreo()) && contraseña.equals(listaUsuario.get(i).getContraseña())) {
                Toast.makeText(this, " Bienvenido " + listaUsuario.get(i).getNombre(), Toast.LENGTH_LONG).show();
                usuarioEncontrado = true;
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
            if (correo.isEmpty() || contraseña.isEmpty()) {
                Toast.makeText(this, "Llena los campos", Toast.LENGTH_LONG).show();
            } else {
                if (!usuarioEncontrado) {
                    Toast.makeText(this, "El correo o contraseña son incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btIngresar) {
            ingresarSesion();
        }
    }
}