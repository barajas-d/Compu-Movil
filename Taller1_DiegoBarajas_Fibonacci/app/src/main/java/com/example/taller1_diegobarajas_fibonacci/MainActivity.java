package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    TextView serie;
    TextView cantidadFactorial;
    TextView cantidadFibonacci;
    Button calcular;
    EditText cantidad;
    Spinner spinner;
    Integer callFibonacci;
    Integer callFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callFibonacci = 0;
        callFactorial = 0;

        cantidadFactorial = findViewById(R.id.cantidadFactorial);
        cantidadFibonacci = findViewById(R.id.cantidadFibonacci);


        spinner = findViewById(R.id.spinner);
        ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource(this, R.array.factorial_value, android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(spinner_adapter);

        calcular = findViewById(R.id.calcular);
        cantidad = findViewById(R.id.cantidad);

    }

    protected void onResume() {
        super.onResume();

        cantidadFactorial.setText("Factorial: " + callFactorial);
        cantidadFibonacci.setText("Fibonacci: " + callFibonacci);
    }

    protected void callBack(){

    }

    public void buttonFibonacci(View v){
        Intent change = new Intent(this, Fibonacci.class);
        startActivity(change);
    }

    public void buttonFactorial(View v){
        Intent change = new Intent(this, Factorial.class);
        change.putExtra("factor", Integer.parseInt(spinner.getSelectedItem().toString()));
        callFactorial++;
        startActivity(change);
    }

    public void Calcular(View v){
        Intent change = new Intent(this, Serie_Fibonacci.class);
        change.putExtra("cantidad", Integer.parseInt(cantidad.getText().toString()));
        callFibonacci++;
        startActivity(change);
    }

    public void Paises(View v){
        Intent change = new Intent(this, paises.class);
        startActivity(change);
    }

}
