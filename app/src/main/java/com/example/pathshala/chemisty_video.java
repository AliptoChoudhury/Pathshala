package com.example.pathshala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class chemisty_video extends AppCompatActivity {
    Button button151,button111;
    SurfaceView surfaceView1;
    MediaPlayer mediaPlayer2;
    SeekBar seekBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemisty_video);

        surfaceView1 = findViewById(R.id.surfaceView1);
        button151 = findViewById(R.id.button151);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.solid);
        surfaceView1.setKeepScreenOn(true);
        seekBar1 = findViewById(R.id.seekBar1);
        SurfaceHolder surfaceHolder1 = surfaceView1.getHolder();
        surfaceHolder1.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer2.setDisplay(surfaceHolder1);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
        seekBar1.setMax(mediaPlayer2.getDuration());
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    mediaPlayer2.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                    button151.setText("PLAY");
                }
                else {
                    mediaPlayer2.start();
                    button151.setText("PAUSE");
                }
            }
        });
        button111 = findViewById(R.id.button111);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chemisty_video.this,chemistry.class);
                startActivity(intent);
            }
        });
    }
}