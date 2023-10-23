package com.example.actividadmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class VideosPromo extends AppCompatActivity {

    String[] sedes = {"Arica"};

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterSedes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_promo);

        VideoView video = findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

        autoCompleteTxt = findViewById(R.id.auto_complete_txt2);

        adapterSedes = new ArrayAdapter<String>(this, R.layout.list_sede,sedes);

        autoCompleteTxt.setAdapter(adapterSedes);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if(position == 0){
                    video.pause();
                    String urlVideo = "android.resource://"+getPackageName()+"/"+R.raw.sede_arica;
                    Uri uri = Uri.parse(urlVideo);
                    video.setVideoURI(uri);
                    video.start();
                } /*else if (position == 1) {
                    video.pause();
                    String urlVideo = "android.resource://"+getPackageName()+"/"+R.raw.sede_iquique;
                    Uri uri = Uri.parse(urlVideo);
                    video.setVideoURI(uri);
                    video.start();
                }*/
            }
        });
    }
}