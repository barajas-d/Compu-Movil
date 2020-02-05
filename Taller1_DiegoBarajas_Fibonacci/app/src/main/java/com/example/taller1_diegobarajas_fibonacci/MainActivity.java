package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    TextView serie;
    Button calcular;
    ScrollView display;
    LinearLayout layout;
    Integer cantidadElementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = findViewById(R.id.calcular);
        display = findViewById(R.id.display);
        layout = findViewById(R.id.linearLayout);
        cantidadElementos = 2;

        for (Integer i = 0; i < cantidadElementos; i++){
            TextView vistaNueva = new TextView(this);
            vistaNueva.setText(i.toString());
            vistaNueva.setId(i);
            layout.addView(vistaNueva);
        }

    }

    public void Calcular(View v){

        TextView valor1 = findViewById(cantidadElementos - 1);
        TextView valor2 = findViewById(cantidadElementos - 2);

        Double resultado = Double.parseDouble(valor1.getText().toString()) + Double.parseDouble(valor2.getText().toString());

        TextView vistaNueva = new TextView(this);
        vistaNueva.setText(resultado.toString());
        vistaNueva.setId(cantidadElementos);
        layout.addView(vistaNueva);

        cantidadElementos++;
    }

}
