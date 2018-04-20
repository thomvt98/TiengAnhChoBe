package com.vuthithom.tienganhchobe.listen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

public class Listen6Activity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView ivPlay6;
    private ImageView ivPause6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen6);
        ivPlay6 = findViewById(R.id.ivPlay6);
        ivPause6 = findViewById(R.id.ivPause6);
    }

    public void playListen6(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.house);
        mediaPlayer.start();
//        ivPlay6.setEnabled(false);
//        ivPause6.setEnabled(true);
//        ivPlay6.setBackgroundResource(R.drawable.pause);
    }

    public void pauseListen6(View view) {
        mediaPlayer.pause();
//        ivPlay6.setEnabled(true);
//        ivPause6.setEnabled(false);
//        ivPlay6.setBackgroundResource(R.drawable.pause);
    }
}
