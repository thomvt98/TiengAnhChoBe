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
import com.vuthithom.tienganhchobe.model.Item_Bangchu;

/**
 * Created by vuthithom on 3/25/2018.
 */

public class Activity_BangChu extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gvbangchu;
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_bangchu);
        interview();
    }

    private void interview() {
        gvbangchu = findViewById(R.id.gv_bangchu);
        gvbangchu.setOnItemClickListener(this);
        BangChuAdapter bangChuAdapter = new BangChuAdapter(this);
        gvbangchu.setAdapter(bangChuAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item_Bangchu item_bangchu = (Item_Bangchu) gvbangchu.getAdapter().getItem(position);
//        Toast.makeText(this, item_bangchu.getName(), Toast.LENGTH_SHORT).show();
        if (mPlayer != null) {
            mPlayer.reset();
        }
        mPlayer = MediaPlayer.create(this, item_bangchu.getMp3());
        mPlayer.start();
    }
}
