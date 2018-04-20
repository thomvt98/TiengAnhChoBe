package com.vuthithom.tienganhchobe.main;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.adapter.BangChuAdapter;
import com.vuthithom.tienganhchobe.adapter.ColorAdapter;
import com.vuthithom.tienganhchobe.model.Item_Bangchu;
import com.vuthithom.tienganhchobe.model.Item_Color;

/**
 * Created by vuthithom on 3/25/2018.
 */

public class Activity_Color extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gvcolor;
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_color);
        interview();
    }

    private void interview() {
        gvcolor = findViewById(R.id.gv_color);
        gvcolor.setOnItemClickListener(this);
        ColorAdapter colorAdapter = new ColorAdapter(this);
        gvcolor.setAdapter(colorAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item_Color item_color = (Item_Color) gvcolor.getAdapter().getItem(position);
        Toast.makeText(this, item_color.getNameE(), Toast.LENGTH_SHORT).show();
        if (mPlayer != null) {
            mPlayer.reset();
        }
        mPlayer = MediaPlayer.create(this, item_color.getMp3());
        mPlayer.start();
    }
}
