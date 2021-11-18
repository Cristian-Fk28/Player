package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Hauyno extends AppCompatActivity {


    ImageButton btnHauyno1, btnHauyno2, btnHauyno3, btnHauyno4, btnHauyno5, btnHauyno6, img;
    MediaPlayer mp, mp2, mp3, mp4, mp5, mp6;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hauyno);

        btnHauyno1 = findViewById(R.id.btnHuayno1);
        btnHauyno2 = findViewById(R.id.btnHuayno2);
        btnHauyno3 = findViewById(R.id.btnHuayno3);
        btnHauyno4 = findViewById(R.id.btnHuayno4);
        btnHauyno5 = findViewById(R.id.btnHuayno5);
        btnHauyno6 = findViewById(R.id.btnHuayno6);

        ed = findViewById(R.id.EditText);

        mp = MediaPlayer.create(this, R.raw.alicia);
        mp2 = MediaPlayer.create(this, R.raw.conedmayta);
        mp3 = MediaPlayer.create(this, R.raw.massalcador);
        mp4 = MediaPlayer.create(this, R.raw.pueblo);
        mp5 = MediaPlayer.create(this, R.raw.ruben);
        mp6 = MediaPlayer.create(this, R.raw.maxcastro);
        btnHauyno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                    btnHauyno1.setBackgroundResource(R.drawable.alicia);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("HUAYNO: ");
                    Toast.makeText(Hauyno.this, "Pausa: ALICIA DELGADO ", Toast.LENGTH_LONG).show();

                }else {
                    mp.start();
                    btnHauyno1.setBackgroundResource(R.drawable.pausee);
                    ed.setText(" ALICIA DELGADO.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Hauyno.this, "Play: ALICIA DELGADO", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnHauyno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                    btnHauyno2.setBackgroundResource(R.drawable.condemayta);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("HUAYNO: ");
                    Toast.makeText(Hauyno.this, "Pausa: CONDEMAYTA DE ACOMAYO", Toast.LENGTH_LONG).show();

                }else {
                    mp2.start();
                    btnHauyno2.setBackgroundResource(R.drawable.pausee);
                    ed.setText(" CONDEMAYTA DE ACOMAYO  .mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Hauyno.this, "Play:CONDEMAYTA DE ACOMAYO", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnHauyno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();
                    btnHauyno3.setBackgroundResource(R.drawable.max);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("HUAYNO: ");
                    Toast.makeText(Hauyno.this, "Pausa: MAX SALVADOR", Toast.LENGTH_LONG).show();

                }else {
                    mp3.start();
                    btnHauyno3.setBackgroundResource(R.drawable.pausee);
                    ed.setText(" MAX SALVADOR.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Hauyno.this, "Play: MAX SALVADOR", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnHauyno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp4.isPlaying()){
                    mp4.pause();
                    btnHauyno4.setBackgroundResource(R.drawable.padino);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("HUAYNO: ");
                    Toast.makeText(Hauyno.this, "Pausa: PUEBLO ANDINO", Toast.LENGTH_LONG).show();

                }else {
                    mp4.start();
                    btnHauyno4.setBackgroundResource(R.drawable.pausee);
                    ed.setText("PUEBLO ANDINO.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Hauyno.this, "Play: PUEBLO ANDINO", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnHauyno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp5.isPlaying()){
                    mp5.pause();
                    btnHauyno5.setBackgroundResource(R.drawable.ruber);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("HUAYNO: ");
                    Toast.makeText(Hauyno.this, "Pausa: RUBEN CABELLO ", Toast.LENGTH_LONG).show();

                }else {
                    mp5.start();
                    btnHauyno5.setBackgroundResource(R.drawable.pausee);
                    ed.setText("RUBEN CABELLO.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Hauyno.this, "Play: RUBEN CABELLO", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnHauyno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp6.isPlaying()){
                    mp6.pause();
                    btnHauyno6.setBackgroundResource(R.drawable.maxcastro);
                    // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("HUAYNO: ");
                    Toast.makeText(Hauyno.this, "Pausa: MAX CASTRO ", Toast.LENGTH_LONG).show();

                }else {
                    mp6.start();
                    btnHauyno6.setBackgroundResource(R.drawable.pausee);
                    ed.setText(" MAX CASTRO.mp3");
                    // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Hauyno.this, "Play: MAX CASTRO", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void huayno1(View view) {
    }
    public void huayno2(View view) {
    }
    public void huayno3(View view) {
    }
    public void huayno4(View view) {
    }
    public void huayno5(View view) {
    }
    public void huayno6(View view) {
    }
}