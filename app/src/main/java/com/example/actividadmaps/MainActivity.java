package com.example.actividadmaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class    MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    GoogleMap mMap;
    String[] sedes = {"Arica","Iquique","Antofagasta","La Serena","Viña del Mar","Santiago","Talca","Concepción","Los Angeles","Temuco","Valdivia","Osorno","Puerto Montt"};

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterSedes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);

        autoCompleteTxt = findViewById(R.id.auto_complete_txt);

        adapterSedes = new ArrayAdapter<String>(this, R.layout.list_sede,sedes);

        autoCompleteTxt.setAdapter(adapterSedes);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if(position == 0){
                    LatLng Arica = new LatLng(-18.4824962798507, -70.31016702642178);
                    mMap.addMarker(new MarkerOptions().position(Arica).title("Santo Tomás Arica"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));
                } else if (position == 1) {
                    LatLng Iquique = new LatLng(-20.218954114722507, -70.14082823494628);
                    mMap.addMarker(new MarkerOptions().position(Iquique).title("Santo Tomás Iquique"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));
                }else if (position == 2) {
                    LatLng Antofagasta = new LatLng(-23.63446609809755, -70.39399895997958);
                    mMap.addMarker(new MarkerOptions().position(Antofagasta).title("Santo Tomás Antofagasta"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));
                }else if (position == 3) {
                    LatLng Serena = new LatLng(-29.908527475033193, -71.25718328859367);
                    mMap.addMarker(new MarkerOptions().position(Serena).title("Santo Tomás La Serena"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Serena));
                }else if (position == 4) {
                    LatLng Vina = new LatLng(-33.03678694187926, -71.52223803264494);
                    mMap.addMarker(new MarkerOptions().position(Vina).title("Santo Tomás Viña del Mar"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Vina));
                }else if (position == 5) {
                    LatLng Santiago = new LatLng(-33.4488126390333, -70.66087706331437);
                    mMap.addMarker(new MarkerOptions().position(Santiago).title("Santo Tomás Santiago"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Santiago));
                }else if (position == 6) {
                    LatLng Talca = new LatLng(-35.428289070565135, -71.6731081193519);
                    mMap.addMarker(new MarkerOptions().position(Talca).title("Santo Tomás Talca"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));
                }else if (position == 7) {
                    LatLng Concepcion = new LatLng(-36.825959728815384, -73.06163602898886);
                    mMap.addMarker(new MarkerOptions().position(Concepcion).title("Santo Tomás Concepción"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Concepcion));
                }else if (position == 8) {
                    LatLng Angeles = new LatLng(-37.471945477616806, -72.3539627171004);
                    mMap.addMarker(new MarkerOptions().position(Angeles).title("Santo Tomás Los Angeles"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Angeles));
                }else if (position == 9) {
                    LatLng Temuco = new LatLng(-38.734491676278004, -72.60202470138356);
                    mMap.addMarker(new MarkerOptions().position(Temuco).title("Santo Tomás Temuco"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));
                }else if (position == 10) {
                    LatLng Valdivia = new LatLng(-39.81726029794908, -73.23311134582133);
                    mMap.addMarker(new MarkerOptions().position(Valdivia).title("Santo Tomás Valdivia"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Valdivia));
                }else if (position == 11) {
                    LatLng Osorno = new LatLng(-40.57157073352139, -73.13757572858842);
                    mMap.addMarker(new MarkerOptions().position(Osorno).title("Santo Tomás Osorno"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));
                }else if (position == 12) {
                    LatLng Puerto = new LatLng(-41.472717205553934, -72.92888564758792);
                    mMap.addMarker(new MarkerOptions().position(Puerto).title("Santo Tomás Puerto Montt"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Puerto));
                }
            }
        });
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        LatLng Chile = new LatLng(-35.67147, -71.542969);
        mMap.addMarker(new MarkerOptions().position(Chile).title("Chile"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chile));
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng){

    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng){

    }

    public void goVistaVideos(View view){
        Intent vista = new Intent(this,VideosPromo.class);
        startActivity(vista);
    }

}