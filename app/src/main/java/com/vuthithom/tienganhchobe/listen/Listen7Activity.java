package com.vuthithom.tienganhchobe.listen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

public class Listen7Activity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private ImageView ivPlay7;
    private ImageView ivPause7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen7);
        ivPlay7 = findViewById(R.id.ivPlay7);
        ivPause7 = findViewById(R.id.ivPause7);
    }

    public void playListen7(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.national);
        mediaPlayer.start();
//        ivPlay7.setEnabled(false);
//        ivPause7.setEnabled(true);
//        ivPlay7.setBackgroundResource(R.drawable.pause);
    }

    public void pauseListen7(View view) {
        mediaPlayer.pause();
//        ivPlay7.setEnabled(true);
//        ivPause7.setEnabled(false);
//        ivPlay7.setBackgroundResource(R.drawable.pause);
    }
}
