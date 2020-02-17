package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class otra extends AppCompatActivity {

    String[] arreglo;
    ArrayList<Pais> arreglo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        arreglo2 = new ArrayList<Pais>();



        try {
            JSONObject json = new JSONObject(this.loadJSONFromAsset());
            JSONArray paisesJsonArray = json.getJSONArray("paises");
            arreglo = new String[paisesJsonArray.length()];
            for(int i=0; i<paisesJsonArray.length(); i++){
                String nombre = json.getString("nombre_pais");
                String capital = json.getString("capital");
                String nombre_in = json.getString("nombre_pais_int");
                String siglas = json.getString("siglas");

                Pais nuevoPais = new Pais(capital, nombre, nombre_in, siglas);
                arreglo2.add(nuevoPais);
                arreglo[i] = nuevoPais.getNombre().toString();
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

        //arreglo = getResources().getStringArray(R.array.paises);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arreglo);
        ListView listView = findViewById(R.id.Lview);
        listView.setAdapter(adapter);



    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("paises.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

}
