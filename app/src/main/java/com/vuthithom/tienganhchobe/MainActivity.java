package com.vuthithom.tienganhchobe;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.main.ActivityGioiThieu;
import com.vuthithom.tienganhchobe.main.Activity_Start;

public class MainActivity extends AppCompatActivity {
    private ImageView imStart;
    private ImageView imIntroduce;
    private ImageView imExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imStart = (ImageView) findViewById(R.id.imstart);
        imIntroduce = (ImageView) findViewById(R.id.imintroduce);
        imExit = (ImageView) findViewById(R.id.imexit);

        imStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Start.class);
                startActivity(intent);
            }
        });

        imIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityGioiThieu.class);
                startActivity(intent);
            }
        });

        imExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });

    }


}
