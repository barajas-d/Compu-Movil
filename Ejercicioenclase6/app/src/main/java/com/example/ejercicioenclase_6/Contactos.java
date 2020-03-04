package com.example.ejercicioenclase_6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;
import android.widget.Toast;
import com.example.ejercicioenclase_6.ContactsAdapter;

public class Contactos extends AppCompatActivity {

    static final int PERMISSION_CONTACTS_ID = 5;
    String[] mProjection;
    Cursor mCursor;
    ContactsAdapter mContactsAdapter;
    ListView mlistaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        mlistaContactos = findViewById(R.id.listaContactos);

        requestPermission(this, Manifest.permission.READ_CONTACTS, "Es necesario para mostrar los contactos", PERMISSION_CONTACTS_ID );

        mProjection = new String[]{ContactsContract.Profile._ID,ContactsContract.Profile.DISPLAY_NAME_PRIMARY};
        mContactsAdapter = new ContactsAdapter(this, null, 0);
        mlistaContactos.setAdapter(mContactsAdapter);

        initView();
    }

    public void initView(){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS)== PackageManager.PERMISSION_GRANTED){
            mCursor=getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, mProjection, null, null, null);
            mContactsAdapter.changeCursor(mCursor);
        }else {

        }
    }

    /**
     * Metodo para solicitar un permiso
     * @param context actividad actual
     * @param permission permiso que se desea solicitar
     * @param just justificacion para el permiso
     * @param id identificador con el se marca la solicitud y se captura el callback de respuesta
     */
    public void requestPermission(Activity context, String permission, String just, int id) {
        if (ContextCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(context, permission)) {
                // Show an expanation to the user *asynchronously*Â  Â
                Toast.makeText(context, just, Toast.LENGTH_LONG).show();
            }
            // request the permission.Â  Â
            ActivityCompat.requestPermissions(context, new String[]{permission}, id);

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        initView();
        //Si se tienen varios casos
//        switch(requestCode){
//            case PERMISSION_CONTACTS_ID: {
//
//                return;
//            }
//        }
    }
}