package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Serie_Fibonacci extends AppCompatActivity {

    Integer cantidadElementos;
    ScrollView display;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie__fibonacci);

        display = findViewById(R.id.display);
        layout = findViewById(R.id.linearLayout);
        cantidadElementos = getIntent().getIntExtra("cantidad", 0);//Integer.parseInt(getIntent().getStringExtra("cantidad").toString());


        for (Integer i = 0; i < cantidadElementos; i++){
            Double resultado = 0.0;
            if(i == 0){
                resultado = 0.0;
            }
            if(i == 1){
                resultado = 1.0;
            }
            if(i > 1){
                TextView valor1 = findViewById(i - 1);
                TextView valor2 = findViewById(i - 2);
                resultado = Double.parseDouble(valor1.getText().toString()) + Double.parseDouble(valor2.getText().toString());
            }
            TextView vistaNueva = new TextView(this);
            vistaNueva.setText(resultado.toString());
            vistaNueva.setId(i);
            layout.addView(vistaNueva);
        }

    }
}
