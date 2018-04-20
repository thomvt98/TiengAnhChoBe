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
import com.vuthithom.tienganhchobe.adapter.QuaAdapter;
import com.vuthithom.tienganhchobe.model.Item_Color;
import com.vuthithom.tienganhchobe.model.Item_Qua;

/**
 * Created by vuthithom on 4/1/2018.
 */

public class ActivityQua extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gvcolor;
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_qua);
        interview();
    }

    private void interview() {
        gvcolor = findViewById(R.id.gv_qua);
        gvcolor.setOnItemClickListener(this);
        QuaAdapter colorAdapter = new QuaAdapter(this);
        gvcolor.setAdapter(colorAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item_Qua item_color = (Item_Qua) gvcolor.getAdapter().getItem(position);
        Toast.makeText(this, item_color.getNameE(), Toast.LENGTH_SHORT).show();
        if (mPlayer != null) {
            mPlayer.reset();
        }
        mPlayer = MediaPlayer.create(this, item_color.getMp3());
        mPlayer.start();
    }
}
