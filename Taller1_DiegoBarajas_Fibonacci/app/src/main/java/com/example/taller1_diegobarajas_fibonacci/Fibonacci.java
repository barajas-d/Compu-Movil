package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Fibonacci extends AppCompatActivity {


    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
        webView = findViewById(R.id.webFibonacci);
        webView.loadUrl("http://maralboran.org/wikipedia/index.php/Fibonacci");
    }
}
