package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Pop extends AppCompatActivity {

    Button play, Parar, Siguiente, Repetir, Anterior;
    ImageView iv;
    MediaPlayer mp;
    int repetir=2, posicion=0;
    MediaPlayer vectormp []= new MediaPlayer[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        play=(Button) findViewById(R.id.btnPlay);
        Parar=(Button) findViewById(R.id.btnParar);
        Siguiente=(Button) findViewById(R.id.btnSiguiente);
        Repetir=(Button) findViewById(R.id.btnRepetir);
        Anterior=(Button) findViewById(R.id.btnAnterior);
        iv=(ImageView) findViewById(R.id.IMG);

        vectormp[0]=MediaPlayer.create(this,R.raw.avicii);
        vectormp[1]=MediaPlayer.create(this,R.raw.tiesto);
        vectormp[2]=MediaPlayer.create(this,R.raw.daft);
        vectormp[3]=MediaPlayer.create(this,R.raw.dead);
        vectormp[4]=MediaPlayer.create(this,R.raw.martin);
        vectormp[5]=MediaPlayer.create(this,R.raw.srilex);

    }
    public void Play(View view){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].pause();
                play.setBackgroundResource(R.drawable.play);
                Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
            }else{
                vectormp[posicion].start();
                play.setBackgroundResource(R.drawable.pausee);
                Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
            }
    }
    public void Stop(View view){
        if(vectormp[posicion]!= null){
            vectormp[posicion].stop();
            vectormp[0]=MediaPlayer.create(this,R.raw.avicii);
            vectormp[1]=MediaPlayer.create(this,R.raw.tiesto);
            vectormp[2]=MediaPlayer.create(this,R.raw.daft);
            vectormp[3]=MediaPlayer.create(this,R.raw.dead);
            vectormp[4]=MediaPlayer.create(this,R.raw.martin);
            vectormp[5]=MediaPlayer.create(this,R.raw.srilex);
            posicion=0;
            play.setBackgroundResource(R.drawable.play);
            iv.setImageResource(R.drawable.avicii);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }
    public void Repetir(View view){
        if(repetir==1){
                Repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "No Repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir=2;
        }else{
            Repetir.setBackgroundResource(R.drawable.repetir1);
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir=1;
        }
    }
    public void Siguiente(View view){
            if(posicion<vectormp.length -1){

                if(vectormp[posicion].isPlaying()){
                    vectormp[posicion].stop();
                    posicion++;
                    vectormp[posicion].start();
                    if(posicion==0){
                        iv.setImageResource(R.drawable.avicii);
                    }else if(posicion==1){
                        iv.setImageResource(R.drawable.tiesto);
                    }else if(posicion==2){
                        iv.setImageResource(R.drawable.daft);
                    }else if(posicion==3){
                        iv.setImageResource(R.drawable.dead);
                    }else if(posicion==4){
                        iv.setImageResource(R.drawable.martin);
                    }else if(posicion==5){
                        iv.setImageResource(R.drawable.srilex);
                    }

                }else{
                    posicion++;
                    if(posicion==0){
                        iv.setImageResource(R.drawable.avicii);
                    }else if(posicion==1){
                        iv.setImageResource(R.drawable.tiesto);
                    }else if(posicion==2){
                        iv.setImageResource(R.drawable.daft);
                    }else if(posicion==3){
                        iv.setImageResource(R.drawable.dead);
                    }else if(posicion==4){
                        iv.setImageResource(R.drawable.martin);
                    }else if(posicion==5){
                        iv.setImageResource(R.drawable.srilex);
                }
                }
            }else{
                Toast.makeText(this, "No Hay mas Canciones", Toast.LENGTH_SHORT).show();
            }
    }
    public void Anterior(View view){
        if(posicion>=1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp[0]=MediaPlayer.create(this,R.raw.avicii);
                vectormp[1]=MediaPlayer.create(this,R.raw.tiesto);
                vectormp[2]=MediaPlayer.create(this,R.raw.daft);
                vectormp[3]=MediaPlayer.create(this,R.raw.dead);
                vectormp[4]=MediaPlayer.create(this,R.raw.martin);
                vectormp[5]=MediaPlayer.create(this,R.raw.srilex);
                posicion--;
                if(posicion==0){
                    iv.setImageResource(R.drawable.avicii);
                }else if(posicion==1){
                    iv.setImageResource(R.drawable.tiesto);
                }else if(posicion==2){
                    iv.setImageResource(R.drawable.daft);
                }else if(posicion==3){
                    iv.setImageResource(R.drawable.dead);
                }else if(posicion==4){
                    iv.setImageResource(R.drawable.martin);
                }else if(posicion==5){
                    iv.setImageResource(R.drawable.srilex);
            }
                vectormp[posicion].start();
            }else{
                posicion--;
            if(posicion==0){
                iv.setImageResource(R.drawable.avicii);
            }else if(posicion==1){
                iv.setImageResource(R.drawable.tiesto);
            }else if(posicion==2){
                iv.setImageResource(R.drawable.daft);
            }else if(posicion==3){
                iv.setImageResource(R.drawable.dead);
            }else if(posicion==4){
                iv.setImageResource(R.drawable.martin);
            }else if(posicion==5){
                iv.setImageResource(R.drawable.srilex);
        }
            }

        }else{
            Toast.makeText(this, "No Hay mas Canciones",Toast.LENGTH_SHORT).show();
        }
    }

}