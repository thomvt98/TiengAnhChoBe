package com.vuthithom.tienganhchobe.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vuthithom.tienganhchobe.R;

/**
 * Created by vuthithom on 3/25/2018.
 */

public class Acitivity_BaiHoc extends AppCompatActivity {
    private ImageView imBangchu, imgcolor, imgDongvat, imgsodem, imghoa, imgnhacua, imgqua, imgquocgia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baihoc);
        imBangchu = findViewById(R.id.iv_bangchu);
        imgsodem = findViewById(R.id.iv_number);
        imgcolor = findViewById(R.id.iv_mauxac);
        imgDongvat = findViewById(R.id.iv_dongvat);
        imghoa = findViewById(R.id.iv_hoa);
        imgnhacua = findViewById(R.id.iv_truonghoc);
        imgqua = findViewById(R.id.iv_qua);
        imgquocgia = findViewById(R.id.iv_quocgiav);

        imBangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Acitivity_BaiHoc.this, Activity_BangChu.class);
                startActivity(intent);
            }
        });
        imgcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Acitivity_BaiHoc.this, Activity_Color.class);
                startActivity(intent1);
            }
        });
        imgDongvat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Acitivity_BaiHoc.this, Activity_DongVat.class);
                startActivity(intent1);
            }
        });
        imgsodem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Acitivity_BaiHoc.this, Activity_SoDem.class);
                startActivity(intent1);
            }
        });
        imghoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Acitivity_BaiHoc.this, Activity_Hoa.class);
                startActivity(intent1);
            }
        });
        imgnhacua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Acitivity_BaiHoc.this, Activity_TruongHoc.class);
                startActivity(intent1);
            }
        });
        imgqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Acitivity_BaiHoc.this, ActivityQua.class);
                startActivity(intent1);
            }
        });
        imgquocgia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Acitivity_BaiHoc.this, Activity_QuocGia.class);
                startActivity(intent1);
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
                        Acitivity_BaiHoc.super.onBackPressed();
                    }
                }).create().show();
    }

}
