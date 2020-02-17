package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class paisDetalle extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais_detalle);

        textView = findViewById(R.id.detalles);

        Pais pais = (Pais)getIntent().getSerializableExtra("pais");

        //construir el mensaje
        String mensaje = "Pais Seleccionado: " + pais.getNombre_pais() + "\nNombre pais internacional: " + pais.getNombre_pais_int() + "\nCapital: " + pais.getCapital() + "\nSiglas: " + pais.getSigla();

        textView.setText(mensaje);
    }
}
