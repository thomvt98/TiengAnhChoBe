package com.vuthithom.tienganhchobe.listen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

public class Listen3Activity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView ivPlay3;
    private ImageView ivPause3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen3);
        ivPlay3 = findViewById(R.id.ivPlay3);
        ivPause3 = findViewById(R.id.ivPause3);
    }

    public void playListen3(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.animal);
        mediaPlayer.start();
//        ivPlay3.setEnabled(false);
//        ivPause3.setEnabled(true);
//        ivPlay3.setBackgroundResource(R.drawable.pause);
    }

    public void pauseListen3(View view) {
        mediaPlayer.pause();
//        ivPlay3.setEnabled(true);
//        ivPause3.setEnabled(false);
//        ivPlay3.setBackgroundResource(R.drawable.pause);
    }
}
