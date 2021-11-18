package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class botones extends AppCompatActivity {

    ImageButton btnRock1, btnRock2,btnRock3,btnRock4,btnRock5,btnRock6, img;
    MediaPlayer mp, mp2, mp3,mp4 ,mp5, mp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);


        btnRock1=findViewById(R.id.Rock1);
        btnRock2=findViewById(R.id.Rock2);
        btnRock3=findViewById(R.id.Rock3);
        btnRock4=findViewById(R.id.Rock4);
        btnRock5=findViewById(R.id.Rock5);
        btnRock6=findViewById(R.id.Rock6);
        img=findViewById(R.id.btnImagenes);

        mp= MediaPlayer.create(this,R.raw.turks);
        mp2=MediaPlayer.create(this,R.raw.apha);
        mp3=MediaPlayer.create(this,R.raw.kiss);
        mp4=MediaPlayer.create(this,R.raw.africa);
        mp5=MediaPlayer.create(this,R.raw.van);
        mp6=MediaPlayer.create(this,R.raw.maniac);

        btnRock1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                    btnRock1.setBackgroundResource(R.drawable.young_turks);
                    img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(botones.this, "Pausa: Young Turks", Toast.LENGTH_LONG).show();
                }else {
                    mp.start();
                    btnRock1.setBackgroundResource(R.drawable.pause);
                    img.setBackgroundResource(R.drawable.young_turks);
                    Toast.makeText(botones.this, "Play: Young Turks", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnRock2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                    btnRock2.setBackgroundResource(R.drawable.alphaville_big_in_japan);
                    img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(botones.this, "Pausa: Alphaville", Toast.LENGTH_LONG).show();
                }else {
                    mp2.start();
                    btnRock2.setBackgroundResource(R.drawable.pause);
                    img.setBackgroundResource(R.drawable.alphaville_big_in_japan);
                    Toast.makeText(botones.this, "Play: Alphaville", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRock3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();
                    btnRock3.setBackgroundResource(R.drawable.kiss);
                    img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(botones.this, "PAUSA:  Kiss", Toast.LENGTH_LONG).show();
                }else {
                    mp3.start();
                    btnRock3.setBackgroundResource(R.drawable.pause);
                    img.setBackgroundResource(R.drawable.kiss);
                    Toast.makeText(botones.this, "PLAY: Kiss", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRock4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp4.isPlaying()){
                    mp4.pause();
                    btnRock4.setBackgroundResource(R.drawable.toto);
                    img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(botones.this, "PAUSA: Toto Africa", Toast.LENGTH_LONG).show();
                }else {
                    mp4.start();
                    btnRock4.setBackgroundResource(R.drawable.pause);
                    img.setBackgroundResource(R.drawable.toto);
                    Toast.makeText(botones.this, "PLAY: Toto Africa", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRock5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp5.isPlaying()){
                    mp5.pause();
                    btnRock5.setBackgroundResource(R.drawable.ghvcbs);
                    img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(botones.this, "PAUSA: Van Helen", Toast.LENGTH_LONG).show();
                }else {
                    mp5.start();
                    btnRock5.setBackgroundResource(R.drawable.pause);
                    img.setBackgroundResource(R.drawable.ghvcbs);
                    Toast.makeText(botones.this, "PLAY: Van Helen", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRock6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp6.isPlaying()){
                    mp6.pause();
                    btnRock6.setBackgroundResource(R.drawable.semebello);
                    img.setBackgroundResource(R.drawable.fondrock);
                    Toast.makeText(botones.this, "PAUSA: Michael Sembello", Toast.LENGTH_LONG).show();
                }else {
                    mp6.start();
                    btnRock6.setBackgroundResource(R.drawable.pause);
                    img.setBackgroundResource(R.drawable.semebello);
                    Toast.makeText(botones.this, "PLAY: Michael Sembello", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void Rock(View view) {
        Toast.makeText( this, "Este es el Gallo", Toast.LENGTH_LONG).show();
    }

    public void Rock2(View view) {
        Toast.makeText( this, "Este es el Gallo", Toast.LENGTH_LONG).show();
    }

    public void Rock3(View view) {
        Toast.makeText( this, "Este es el Gallo", Toast.LENGTH_LONG).show();
    }

    public void Rock4(View view) {
        Toast.makeText( this, "Este es el Gallo", Toast.LENGTH_LONG).show();
    }

    public void Rock5(View view) {
        Toast.makeText( this, "Este es el Gallo", Toast.LENGTH_LONG).show();
    }

    public void Rock6(View view) {
        Toast.makeText( this, "Este es el Gallo", Toast.LENGTH_LONG).show();
    }

    public void img(View view) {
    }
}