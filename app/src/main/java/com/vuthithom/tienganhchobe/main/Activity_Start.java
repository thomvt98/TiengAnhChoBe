package com.vuthithom.tienganhchobe.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;

/**
 * Created by vuthithom on 3/21/2018.
 */

public class Activity_Start extends AppCompatActivity {
    private ImageView imKiemtra;
    private ImageView imBaiHoc, imggiaitri, imgluyennghe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        imKiemtra = findViewById(R.id.kiemtra);
        imBaiHoc = findViewById(R.id.baihoc);
        imggiaitri = findViewById(R.id.giaitri);
        imgluyennghe = findViewById(R.id.luyennghe);
        imKiemtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Start.this, Activity_Test.class);
                startActivity(intent);
            }
        });
        imBaiHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Start.this, Acitivity_BaiHoc.class);
                startActivity(intent);
            }
        });
        imggiaitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Start.this, ActVideo.class);
                startActivity(intent);
            }
        });
        imgluyennghe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Start.this, ListenActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("English for kids")
                .setMessage("Bạn có muốn thoát?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        Activity_Start.super.onBackPressed();
                    }
                }).create().show();
    }
}
