package com.vuthithom.tienganhchobe;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vuthithom on 3/27/2018.
 */

public class ChuyenManHinh extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_chuyenmanhinh);
        // cái này ý, tức là ở màn hình nào đó sau 4s nó mới chueyern à vâng,ok
        Thread bamgio = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                } catch (Exception e) {

                } finally {
                    Intent activitymoi = new Intent("com.vuthithom.tienganhchobe.MainActivity");
                    startActivity(activitymoi);
                }
            }
        };
        bamgio.start();
    }

    protected void onPause() {
        super.onPause();
        finish();
    }
}
