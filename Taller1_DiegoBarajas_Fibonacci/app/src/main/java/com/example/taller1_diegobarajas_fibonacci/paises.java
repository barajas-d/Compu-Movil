package com.example.taller1_diegobarajas_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class paises extends AppCompatActivity {

    ListView listView;
    ArrayList<String> paises;
    ArrayList<Pais> paisesClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises);

        paises = new ArrayList<>();
        paisesClass = new ArrayList<>();

        try {
            JSONObject json = new JSONObject(loadJSONFromAsset());
            JSONArray paisesJsonArray = json.getJSONArray("paises");
            for (int i = 0; i < paisesJsonArray.length(); i++) {
                JSONObject jsonObject = paisesJsonArray.getJSONObject(i);
                String nombre = jsonObject.getString("nombre_pais");
                paises.add(nombre);
                Pais nuevoPais = new Pais(jsonObject.getString("nombre_pais"), jsonObject.getString("nombre_pais_int"), jsonObject.getString("capital"), jsonObject.getString("sigla"));
                paisesClass.add(nuevoPais);
            }
        }
        catch (JSONException Ex){
            Ex.getStackTrace();
        }

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, paises);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), paisDetalle.class);
                Pais paisSeleccionado = paisesClass.get(position);
                intent.putExtra("pais", paisSeleccionado);
                startActivity(intent);
            }
        });

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

