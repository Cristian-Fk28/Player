package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Baladas extends AppCompatActivity {

    ImageButton btnbaladas1, btnbaladas2,btnbaladas3,btnbaladas4,btnbaladas5,btnbaladas6, img;
    MediaPlayer mp, mp2, mp3,mp4 ,mp5, mp6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baladas);

        btnbaladas1=findViewById(R.id.btnbaladas1);
        btnbaladas2=findViewById(R.id.btnbaladas2);
        btnbaladas3=findViewById(R.id.btnbaladas3);
        btnbaladas4=findViewById(R.id.btnbaladas4);
        btnbaladas5=findViewById(R.id.btnbaladas5);
        btnbaladas6=findViewById(R.id.btnbaladas6);

        mp= MediaPlayer.create(this,R.raw.roberto);
        mp2=MediaPlayer.create(this,R.raw.jose);
        mp3=MediaPlayer.create(this,R.raw.juan);
        mp4=MediaPlayer.create(this,R.raw.rafael);
        mp5=MediaPlayer.create(this,R.raw.leo);
        mp6=MediaPlayer.create(this,R.raw.guillermo);

        btnbaladas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                    btnbaladas1.setBackgroundResource(R.drawable.roberto);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(Baladas.this, "Pausa: ROBERTO CARLOS", Toast.LENGTH_LONG).show();
                }else {
                    mp.start();
                    btnbaladas1.setBackgroundResource(R.drawable.pause);
                   // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Baladas.this, "Play: ROBERTO CARLOS", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnbaladas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                    btnbaladas2.setBackgroundResource(R.drawable.jose);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(Baladas.this, "Pausa: JOSE JOSE", Toast.LENGTH_LONG).show();
                }else {
                    mp2.start();
                    btnbaladas2.setBackgroundResource(R.drawable.pause);
                   // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Baladas.this, "Play: JOSE JOSE", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnbaladas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();
                    btnbaladas3.setBackgroundResource(R.drawable.juan);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(Baladas.this, "Pausa: JUAN GABRIEL", Toast.LENGTH_LONG).show();
                }else {
                    mp3.start();
                    btnbaladas3.setBackgroundResource(R.drawable.pause);
                   // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Baladas.this, "Play: JUAN GABRIEL", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnbaladas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp4.isPlaying()){
                    mp4.pause();
                    btnbaladas4.setBackgroundResource(R.drawable.rafa);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(Baladas.this, "Pausa: RAPHAEL", Toast.LENGTH_LONG).show();
                }else {
                    mp4.start();
                    btnbaladas4.setBackgroundResource(R.drawable.pause);
                    //img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Baladas.this, "Play: RAPHAEL", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnbaladas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp5.isPlaying()){
                    mp5.pause();
                    btnbaladas5.setBackgroundResource(R.drawable.leo);
                   // img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(Baladas.this, "Pausa: LEO DAN", Toast.LENGTH_LONG).show();
                }else {
                    mp5.start();
                    btnbaladas5.setBackgroundResource(R.drawable.pause);
                   // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Baladas.this, "Play: LEO DAN", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnbaladas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp6.isPlaying()){
                    mp6.pause();
                    btnbaladas6.setBackgroundResource(R.drawable.guilerrmo);
                   // img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(Baladas.this, "Pausa: GUILLERMO DAVILA", Toast.LENGTH_LONG).show();
                }else {
                    mp6.start();
                    btnbaladas6.setBackgroundResource(R.drawable.pause);
                  //  img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Baladas.this, "Play: GUILLERMO DAVILA", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void baladas1(View view) {
    }

    public void baladas2(View view) {
    }

    public void baladas3(View view) {
    }

    public void baladas4(View view) {
    }

    public void baladas5(View view) {
    }

    public void baladas6(View view) {
    }
}