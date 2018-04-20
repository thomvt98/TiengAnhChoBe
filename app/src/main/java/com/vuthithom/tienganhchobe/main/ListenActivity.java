package com.vuthithom.tienganhchobe.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.listen.Listen1Activity;
import com.vuthithom.tienganhchobe.listen.Listen2Activity;
import com.vuthithom.tienganhchobe.listen.Listen3Activity;
import com.vuthithom.tienganhchobe.listen.Listen4Activity;
import com.vuthithom.tienganhchobe.listen.Listen5Activity;
import com.vuthithom.tienganhchobe.listen.Listen6Activity;
import com.vuthithom.tienganhchobe.listen.Listen7Activity;

/**
 * Created by vuthithom on 4/10/2018.
 */

public class ListenActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_listmain);
    }

    public void listen1(View view) {
        intent = new Intent(ListenActivity.this, Listen1Activity.class);
        startActivity(intent);
    }

    public void listen2(View view) {
        intent = new Intent(ListenActivity.this, Listen2Activity.class);
        startActivity(intent);
    }

    public void listen3(View view) {
        intent = new Intent(ListenActivity.this, Listen3Activity.class);
        startActivity(intent);
    }

    public void listen4(View view) {
        intent = new Intent(ListenActivity.this, Listen4Activity.class);
        startActivity(intent);
    }

    public void listen5(View view) {
        intent = new Intent(ListenActivity.this, Listen5Activity.class);
        startActivity(intent);
    }

    public void listen6(View view) {
        intent = new Intent(ListenActivity.this, Listen6Activity.class);
        startActivity(intent);
    }

    public void listen7(View view) {
        intent = new Intent(ListenActivity.this, Listen7Activity.class);
        startActivity(intent);
    }
}
