package com.vuthithom.tienganhchobe.listen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

public class Listen5Activity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView ivPlay5;
    private ImageView ivPause5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen5);
        ivPlay5 = findViewById(R.id.ivPlay5);
        ivPause5 = findViewById(R.id.ivPause5);
    }

    public void playListen5(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.flower);
        mediaPlayer.start();
//        ivPlay5.setEnabled(false);
//        ivPause5.setEnabled(true);
//        ivPlay5.setBackgroundResource(R.drawable.pause);
    }

    public void pauseListen5(View view) {
        mediaPlayer.pause();
//        ivPlay5.setEnabled(true);
//        ivPause5.setEnabled(false);
//        ivPlay5.setBackgroundResource(R.drawable.pause);
    }
}
