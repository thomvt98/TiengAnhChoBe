package com.vuthithom.tienganhchobe.listen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

public class Listen2Activity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView ivPlay2;
    private ImageView ivPause2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen2);
        ivPlay2 = findViewById(R.id.ivPlay2);
        ivPause2 = findViewById(R.id.ivPause2);
    }

    public void playListen2(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.school);
        mediaPlayer.start();
//        ivPlay2.setEnabled(false);
//        ivPause2.setEnabled(true);
//        ivPlay2.setBackgroundResource(R.drawable.pause);
    }

    public void pauseListen2(View view) {
        mediaPlayer.pause();
//        ivPlay2.setEnabled(true);
//        ivPause2.setEnabled(false);
//        ivPause2.setBackgroundResource(R.drawable.pause);
    }
}
