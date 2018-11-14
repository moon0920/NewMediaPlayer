package com.example.edu.newmediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mPlayer;
    Button btnStop, btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        btnStop = (Button)findViewById(R.id.btnStop);
        btnStop.setOnClickListener(this);
        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);
        Button btnFast = findViewById(R.id.btnFast);
        btnFast.setOnClickListener(this);
        mPlayer = MediaPlayer.create(this,R.raw.thunder_rain);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPlay:
                mPlayer.start();
                btnPlay.setEnabled(false);
                btnStop.setEnabled(true);
            break;
            case R.id.btnStop:
                mPlayer.pause();
                btnStop.setEnabled(false);
                btnPlay.setEnabled(true);
            break;

        }

    }
}
