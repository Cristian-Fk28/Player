package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Salsa extends AppCompatActivity {


    ImageButton btnSalsa1, btnSalsa2, btnSalsa3, btnSalsa4, btnSalsa5, btnSalsa6, img;
    MediaPlayer mp, mp2, mp3, mp4, mp5, mp6;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salsa);

        btnSalsa1 = findViewById(R.id.btnSalsa1);
        btnSalsa2 = findViewById(R.id.btnSalsa2);
        btnSalsa3 = findViewById(R.id.btnSalsa3);
        btnSalsa4 = findViewById(R.id.btnSalsa4);
        btnSalsa5 = findViewById(R.id.btnSalsa5);
        btnSalsa6 = findViewById(R.id.btnSalsa6);
        ed = findViewById(R.id.EditRespuesta);

        mp = MediaPlayer.create(this, R.raw.ricardo);
        mp2 = MediaPlayer.create(this, R.raw.edwin);
        mp3 = MediaPlayer.create(this, R.raw.michael);
        mp4 = MediaPlayer.create(this, R.raw.robertoss);
        mp5 = MediaPlayer.create(this, R.raw.blades);
        mp6 = MediaPlayer.create(this, R.raw.jhony);

        btnSalsa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                    btnSalsa1.setBackgroundResource(R.drawable.salsa1);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("SALSA: ");
                    Toast.makeText(Salsa.this, "Pausa: RICARDOR RAY ", Toast.LENGTH_LONG).show();

                }else {
                    mp.start();
                    btnSalsa1.setBackgroundResource(R.drawable.pausee);
                    ed.setText(" RICARDOR RAY.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Salsa.this, "Play: RICARDOR RAY", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                    btnSalsa2.setBackgroundResource(R.drawable.salsa2);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("SALSA: ");
                    Toast.makeText(Salsa.this, "Pausa: EDWIN RIVERA ", Toast.LENGTH_LONG).show();

                }else {
                    mp2.start();
                    btnSalsa2.setBackgroundResource(R.drawable.pausee);
                    ed.setText("EDWIN RIVERA.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Salsa.this, "Play: EDWIN RIVERA", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();
                    btnSalsa3.setBackgroundResource(R.drawable.salsa4);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("SALSA: ");
                    Toast.makeText(Salsa.this, "Pausa:ROBERTO ANTONIO ", Toast.LENGTH_LONG).show();

                }else {
                    mp3.start();
                    btnSalsa3.setBackgroundResource(R.drawable.pausee);
                    ed.setText("ROBERTO ANTONIO.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Salsa.this, "Play: ROBERTO ANTONIO", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp4.isPlaying()){
                    mp4.pause();
                    btnSalsa4.setBackgroundResource(R.drawable.salsa3);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("SALSA: ");
                    Toast.makeText(Salsa.this, "Pausa: MICHAEL RIVERA ", Toast.LENGTH_LONG).show();

                }else {
                    mp4.start();
                    btnSalsa4.setBackgroundResource(R.drawable.pausee);
                    ed.setText("MICHAEL RIVERA.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Salsa.this, "Play: MICHAEL RIVERA", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp5.isPlaying()){
                    mp5.pause();
                    btnSalsa5.setBackgroundResource(R.drawable.salsa5);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("SALSA: ");
                    Toast.makeText(Salsa.this, "Pausa: ROBERTO BLADES", Toast.LENGTH_LONG).show();

                }else {
                    mp5.start();
                    btnSalsa5.setBackgroundResource(R.drawable.pausee);
                    ed.setText("ROBERTO BLADES.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Salsa.this, "Play: ROBERTO BLADES", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp6.isPlaying()){
                    mp6.pause();
                    btnSalsa6.setBackgroundResource(R.drawable.salsa6);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("SALSA: ");
                    Toast.makeText(Salsa.this, "Pausa: JHONY RIVERA ", Toast.LENGTH_LONG).show();

                }else {
                    mp6.start();
                    btnSalsa6.setBackgroundResource(R.drawable.pausee);
                    ed.setText("JHONY RIVERA.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Salsa.this, "Play:JHONY RIVERA", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void Salsa1(View view) {
    }
    public void Salsa2(View view) {
    }
    public void Salsa3(View view) {
    }
    public void Salsa4(View view) {
    }
    public void Salsa5(View view) {
    }
    public void Salsa6(View view) {
    }
}