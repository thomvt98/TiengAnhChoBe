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
import com.vuthithom.tienganhchobe.adapter.DongVatAdapTer;
import com.vuthithom.tienganhchobe.model.Item_Color;
import com.vuthithom.tienganhchobe.model.Item_DongVat;

/**
 * Created by vuthithom on 3/27/2018.
 */

public class Activity_DongVat extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gvdongvat;
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_dongvat);
        interview();
    }

    private void interview() {
        gvdongvat = findViewById(R.id.gv_dongvat);
        gvdongvat.setOnItemClickListener(this);
        DongVatAdapTer dongVatAdapTer = new DongVatAdapTer(this);
        gvdongvat.setAdapter(dongVatAdapTer);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item_DongVat item_dongVat = (Item_DongVat) gvdongvat.getAdapter().getItem(position);
        Toast.makeText(this, item_dongVat.getNameE(), Toast.LENGTH_SHORT).show();
        if (mPlayer != null) {
            mPlayer.reset();
        }
        mPlayer = MediaPlayer.create(this, item_dongVat.getMp3());
        mPlayer.start();
    }
}
