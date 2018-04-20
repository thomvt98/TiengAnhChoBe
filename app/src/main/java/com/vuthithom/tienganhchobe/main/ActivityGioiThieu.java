package com.vuthithom.tienganhchobe.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.vuthithom.tienganhchobe.R;

/**
 * Created by vuthithom on 4/5/2018.
 */

public class ActivityGioiThieu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_gioithieu);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("English for kids")
                .setMessage("Bạn có muốn thoát?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        ActivityGioiThieu.super.onBackPressed();
                    }
                }).create().show();
    }
}
