package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button audio, salsa, rock,huayno,baladas,pop,regue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audio=findViewById(R.id.btnRock);
        salsa=findViewById(R.id.btnSalsa);
        huayno=findViewById(R.id.btnHauyno);
        baladas=findViewById(R.id.btnBaladas);
        pop=findViewById(R.id.btnPop);
        regue=findViewById(R.id.btnRegue);

        audio = (Button)findViewById(R.id.btnRock);
        salsa = (Button)findViewById(R.id.btnSalsa);
        huayno = (Button)findViewById(R.id.btnHauyno);
        baladas = (Button)findViewById(R.id.btnBaladas);
        pop = (Button)findViewById(R.id.btnPop);
        regue = (Button)findViewById(R.id.btnRegue);


        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido();
            }
        });
        salsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salsa();
            }
        });
        huayno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                huayno();
            }
        });
        baladas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baladas();
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pop();
            }
        });
        regue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regue();
            }
        });
    }
    private void sonido()
    {
        Intent intent = new Intent
                (MainActivity.this,botones.class);
        startActivity(intent);
    }

    public void salsa()
    {
        Intent intent = new Intent
                (MainActivity.this,Salsa.class);
        startActivity(intent);
    }


    public void huayno()
    {
        Intent intent = new Intent
                (MainActivity.this,Hauyno.class);
        startActivity(intent);
    }

    public void baladas()
    {
        Intent intent = new Intent
                (MainActivity.this,Baladas.class);
        startActivity(intent);
    }

    public void pop()
    {
        Intent intent = new Intent
                (MainActivity.this,Pop.class);
        startActivity(intent);
    }
    public void regue()
    {
        Intent intent = new Intent
                (MainActivity.this,Regue.class);
        startActivity(intent);
    }

}