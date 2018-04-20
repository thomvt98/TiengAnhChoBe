package com.vuthithom.tienganhchobe.main;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.adapter.ColorAdapter;
import com.vuthithom.tienganhchobe.adapter.HoaAdapter;
import com.vuthithom.tienganhchobe.model.Item_Color;
import com.vuthithom.tienganhchobe.model.Item_Hoa;

/**
 * Created by vuthithom on 3/28/2018.
 */

public class Activity_Hoa extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gvcolor;
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_hoa);
        interview();
    }

    private void interview() {
        gvcolor = findViewById(R.id.gv_hoa);
        gvcolor.setOnItemClickListener(this);
        HoaAdapter colorAdapter = new HoaAdapter(this);
        gvcolor.setAdapter(colorAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item_Hoa item_color = (Item_Hoa) gvcolor.getAdapter().getItem(position);
        Toast.makeText(this, item_color.getNameE(), Toast.LENGTH_SHORT).show();
        if (mPlayer != null) {
            mPlayer.reset();
        }
        mPlayer = MediaPlayer.create(this, item_color.getMp3());
        mPlayer.start();
    }
}
