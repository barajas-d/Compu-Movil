package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Web extends AppCompatActivity {

    WebView myWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        myWeb = findViewById(R.id.WebView);
        myWeb.loadUrl("https://www.javeriana.edu.co/home");
    }
}
