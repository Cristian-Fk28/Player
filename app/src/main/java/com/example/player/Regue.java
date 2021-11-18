package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Regue extends AppCompatActivity {

    ImageButton btnSalsa1, btnSalsa2,btnSalsa3,btnSalsa4,btnSalsa5,btnSalsa6, img;
    MediaPlayer mp, mp2, mp3,mp4 ,mp5, mp6;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regue);

        btnSalsa1=findViewById(R.id.btnRegue1);
        btnSalsa2=findViewById(R.id.btnRegue2);
        btnSalsa3=findViewById(R.id.btnRegue3);
        btnSalsa4=findViewById(R.id.btnRegue4);
        btnSalsa5=findViewById(R.id.btnRegue5);
        btnSalsa6=findViewById(R.id.btnRegue6);
        ed=findViewById(R.id.EditTextRegue);
        mp= MediaPlayer.create(this,R.raw.alala);
        mp2=MediaPlayer.create(this,R.raw.cultura);
        mp3=MediaPlayer.create(this,R.raw.bunny);
        mp4=MediaPlayer.create(this,R.raw.peter);
        mp5=MediaPlayer.create(this,R.raw.waiters);
        mp6=MediaPlayer.create(this,R.raw.ub40);
        btnSalsa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                    btnSalsa1.setBackgroundResource(R.drawable.bob);
                   // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("REGUE: ");
                    Toast.makeText(Regue.this, "Pausa: BOB MARLEY ", Toast.LENGTH_LONG).show();

                }else {
                    mp.start();
                    btnSalsa1.setBackgroundResource(R.drawable.pausee);
                    ed.setText("BOB MARLEY.mp3");
                   // img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(Regue.this, "Play: BOB MARLEY", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                    btnSalsa2.setBackgroundResource(R.drawable.profe);
                   // img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("REGUE: ");
                    Toast.makeText(Regue.this, "Pausa: CULTURA PROFETICA", Toast.LENGTH_LONG).show();
                }else {
                    mp2.start();
                    btnSalsa2.setBackgroundResource(R.drawable.pausee);
                    //img.setBackgroundResource(R.drawable.young_turks);
                     ed.setText("CULTURA PROFETICA.mp3");
                    Toast.makeText(Regue.this, "Play: CULTURA PROFETICA", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();
                    btnSalsa3.setBackgroundResource(R.drawable.bony);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("REGUE: ");
                    Toast.makeText(Regue.this, "Pausa:  BUNNY WAILER", Toast.LENGTH_LONG).show();
                }else {
                    mp3.start();
                    btnSalsa3.setBackgroundResource(R.drawable.pausee);
                    //img.setBackgroundResource(R.drawable.young_turks);
                    ed.setText("BUNNY WAILER.mp3");
                    Toast.makeText(Regue.this, "Play: BUNNY WAILER", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp4.isPlaying()){
                    mp4.pause();
                    btnSalsa4.setBackgroundResource(R.drawable.peter);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("REGUE: ");
                    Toast.makeText(Regue.this, "Pausa: PETER TOSH", Toast.LENGTH_LONG).show();
                }else {
                    mp4.start();
                    btnSalsa4.setBackgroundResource(R.drawable.pausee);
                     //img.setBackgroundResource(R.drawable.young_turks);
                    ed.setText("PETER TOSH.mp3");
                    Toast.makeText(Regue.this, "Play: PETER TOSH", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp5.isPlaying()){
                    mp5.pause();
                    btnSalsa5.setBackgroundResource(R.drawable.waiters);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("REGUE: ");
                    Toast.makeText(Regue.this, "Pausa: THE WAITERS", Toast.LENGTH_LONG).show();
                }else {
                    mp5.start();
                    btnSalsa5.setBackgroundResource(R.drawable.pausee);
                     //img.setBackgroundResource(R.drawable.young_turks);
                    ed.setText("THE WAITERS.mp3");
                    Toast.makeText(Regue.this, "Play: THE WAITERS", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSalsa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp6.isPlaying()){
                    mp6.pause();
                    btnSalsa6.setBackgroundResource(R.drawable.uh40);
                    //img.setBackgroundResource(R.drawable.fondrock);
                    ed.setText("REGUE: ");
                    Toast.makeText(Regue.this, "Pausa: UBH40", Toast.LENGTH_LONG).show();
                }else {
                    mp6.start();
                    btnSalsa6.setBackgroundResource(R.drawable.pausee);
                    //img.setBackgroundResource(R.drawable.young_turks);
                    ed.setText("UBH40.mp3");
                    Toast.makeText(Regue.this, "Play: UBH40", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void Regue1(View view) {
    }

    public void Regue2(View view) {
    }

    public void Regue3(View view) {
    }

    public void Regue4(View view) {
    }

    public void Regue5(View view) {
    }

    public void Regue6(View view) {
    }
}