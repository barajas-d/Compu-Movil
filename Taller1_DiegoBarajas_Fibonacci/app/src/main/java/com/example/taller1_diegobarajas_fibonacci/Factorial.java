package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Factorial extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);


        Integer factor = getIntent().getIntExtra("factor", 0);
        TextView textView = findViewById(R.id.textView);

        //Construir el mensaje
        String mensaje;
        Integer resultado = 1;
        mensaje = "Multiplicación = ";
        for (Integer i = 1; i<=factor; i++){
            mensaje = mensaje + i.toString();
            if(i != factor){
                resultado = resultado * i;
                mensaje = mensaje + "*";
            }
        }
        mensaje = mensaje + "\nResultado = " + resultado;
        textView.setText(mensaje);
    }
}
