package com.vuthithom.tienganhchobe.listen;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

/**
 * Created by vuthithom on 4/10/2018.
 */

public class Listen1Activity extends AppCompatActivity {
    private ImageView ivPlay1;
    private ImageView ivPause1;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen1);
        ivPlay1 = findViewById(R.id.ivPlay1);
        ivPause1 = findViewById(R.id.ivPause1);
    }

    public void pauseListen1(View view) {
        mediaPlayer.pause();
//        ivPlay1.setEnabled(true);
//        ivPause1.setEnabled(false);
        ivPlay1.setBackgroundResource(R.drawable.pause);
    }

    public void playListen1(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.alphabet);
        mediaPlayer.start();
//        ivPlay1.setEnabled(false);
//        ivPause1.setEnabled(true);
        ivPause1.setBackgroundResource(R.drawable.play);
    }
}
