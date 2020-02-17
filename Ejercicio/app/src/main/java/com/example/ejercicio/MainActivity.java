package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickWeb(View v){
        Intent changeWeb = new Intent(this, Web.class);
        startActivity(changeWeb);
    }

    public void clickFrame(View v){
        TextView texto = findViewById(R.id.Texto);

        Intent changeWeb = new Intent(this, nombreUsuario.class);
        changeWeb.putExtra("Nombre", texto.getText().toString());
        startActivity(changeWeb);
    }

    public void clickList(View v){
        Intent changeList = new Intent(this, otra.class);
        startActivity(changeList);
    }
}
