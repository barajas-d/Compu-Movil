package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class nombreUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre_usuario);

        String nombre = getIntent().getStringExtra("Nombre");
        TextView textView = findViewById(R.id.texto);
        textView.setText(nombre.toString());
    }
}
