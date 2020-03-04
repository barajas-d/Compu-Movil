package com.example.ejercicioenclase_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeContacts(View view){
        Intent change = new Intent(this, Contactos.class);
        startActivity(change);
    }

    public void changeCamera(View view){
        Intent change = new Intent(this, Camara.class);
        startActivity(change);
    }
}
