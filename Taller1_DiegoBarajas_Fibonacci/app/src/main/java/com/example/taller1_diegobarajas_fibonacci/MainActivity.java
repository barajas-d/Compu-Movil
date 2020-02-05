package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    EditText cantidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = findViewById(R.id.calcular);
        cantidad = findViewById(R.id.cantidad);
    }

    public void Calcular(View v){

        /*
        TextView valor1 = findViewById(cantidadElementos - 1);
        TextView valor2 = findViewById(cantidadElementos - 2);

        Double resultado = Double.parseDouble(valor1.getText().toString()) + Double.parseDouble(valor2.getText().toString());

        TextView vistaNueva = new TextView(this);
        vistaNueva.setText(resultado.toString());
        vistaNueva.setId(cantidadElementos);
        layout.addView(vistaNueva);

        cantidadElementos++;
        */

        Intent change = new Intent(this, Serie_Fibonacci.class);
        change.putExtra("cantidad", Integer.parseInt(cantidad.getText().toString()));
        startActivity(change);

    }

}
