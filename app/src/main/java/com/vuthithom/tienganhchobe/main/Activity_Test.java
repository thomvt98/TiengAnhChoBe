package com.vuthithom.tienganhchobe.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.giaitri.Act_BaiTestHai;
import com.vuthithom.tienganhchobe.giaitri.TestAdapter3;
import com.vuthithom.tienganhchobe.giaitri.TestAdapter4;
import com.vuthithom.tienganhchobe.giaitri.TestAdapter5;
import com.vuthithom.tienganhchobe.giaitri.TestAdapter6;
import com.vuthithom.tienganhchobe.giaitri.TestAdapter7;
import com.vuthithom.tienganhchobe.giaitri.TestAdapter8;

/**
 * Created by vuthithom on 3/21/2018.
 */

public class Activity_Test extends AppCompatActivity {
    ImageView ivIconTest1, ivIconTest2, ivIconTest3, ivIconTest4, ivIconTest5, ivIconTest6, ivIconTest7, ivIconTest8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        init();
        ivIconTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, Act_BaiTestMot.class);
                startActivity(intent);
            }
        });
        ivIconTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, Act_BaiTestHai.class);
                startActivity(intent);
            }
        });
        ivIconTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, TestAdapter3.class);
                startActivity(intent);
            }
        });
        ivIconTest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, TestAdapter4.class);
                startActivity(intent);
            }
        });
        ivIconTest5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, TestAdapter5.class);
                startActivity(intent);
            }
        });
        ivIconTest6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, TestAdapter6.class);
                startActivity(intent);
            }
        });
        ivIconTest7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, TestAdapter7.class);
                startActivity(intent);
            }
        });
        ivIconTest8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Test.this, TestAdapter8.class);
                startActivity(intent);
            }
        });

    }

    private void init() {
        ivIconTest1 = findViewById(R.id.bai1);
        ivIconTest2 = findViewById(R.id.bai2);
        ivIconTest3 = findViewById(R.id.bai3);
        ivIconTest4 = findViewById(R.id.bai4);
        ivIconTest5 = findViewById(R.id.bai5);
        ivIconTest6 = findViewById(R.id.bai6);
        ivIconTest7 = findViewById(R.id.bai7);
        ivIconTest8 = findViewById(R.id.bai8);
    }
}
