package com.vuthithom.tienganhchobe.listen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

public class Listen4Activity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView ivPlay4;
    private ImageView ivPause4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen4);
        ivPlay4 = findViewById(R.id.ivPlay4);
        ivPause4 = findViewById(R.id.ivPause4);
    }

    public void playListen4(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fruit);
        mediaPlayer.start();
//        ivPlay4.setEnabled(false);
//        ivPause4.setEnabled(true);
//        ivPlay4.setBackgroundResource(R.drawable.pause);
    }

    public void pauseListen4(View view) {
        mediaPlayer.pause();
//        ivPlay4.setEnabled(true);
//        ivPause4.setEnabled(false);
//        ivPlay4.setBackgroundResource(R.drawable.pause);
    }
}
