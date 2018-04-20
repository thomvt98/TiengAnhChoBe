package com.vuthithom.tienganhchobe.giaitri;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.model.TestLesson;

import java.util.ArrayList;
import java.util.Locale;

public class TestAdapter7 extends Activity implements View.OnClickListener {
    private ImageView ivTestSound, ivTest1, ivTest2, ivTest3, ivTest4, ivTestNext;
    private ArrayList<TestLesson> list = new ArrayList<>();
    private int mIndext = 0;
    private TextView tvTestNumber;
    private TextToSpeech toSpeech;
    private int position1 = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_test);
        init();
        int number = getIntent().getIntExtra("number", 1);

    }

    private void init() {
        ivTestSound = findViewById(R.id.ivTestSound);
        ivTest1 = findViewById(R.id.ivTest1);
        ivTest2 = findViewById(R.id.ivTest2);
        ivTest3 = findViewById(R.id.ivTest3);
        ivTest4 = findViewById(R.id.ivTest4);
        ivTestNext = findViewById(R.id.ivTestNext);
        tvTestNumber = findViewById(R.id.tvTestNumber);
        ivTest1.setOnClickListener(this);
        ivTest2.setOnClickListener(this);
        ivTest3.setOnClickListener(this);
        ivTest4.setOnClickListener(this);
        ivTestSound.setOnClickListener(this);
        initQuesion7();
        nextQuestion(mIndext);
    }

    private void nextQuestion(int position) {
        TestLesson test = list.get(position);
        ivTestSound.setContentDescription(test.getAnswer());

        ivTest1.setContentDescription(test.getText()[0]);
        ivTest2.setContentDescription(test.getText()[1]);
        ivTest3.setContentDescription(test.getText()[2]);
        ivTest4.setContentDescription(test.getText()[3]);

        ivTest1.setImageResource(test.getIdImg()[0]);
        ivTest1.getLayoutParams().height = 228;
        ivTest1.getLayoutParams().width = 228;


        ivTest2.setImageResource(test.getIdImg()[1]);
        ivTest2.getLayoutParams().height = 228;
        ivTest2.getLayoutParams().width = 228;

        ivTest3.setImageResource(test.getIdImg()[2]);
        ivTest3.getLayoutParams().height = 228;
        ivTest3.getLayoutParams().width = 228;

        ivTest4.setImageResource(test.getIdImg()[3]);
        ivTest4.getLayoutParams().height = 228;
        ivTest4.getLayoutParams().width = 228;

        tvTestNumber.setText("Câu hỏi số :" + (mIndext + 1) + "/" + list.size());
    }

    private void initQuesion7() {
        list.add(new TestLesson(
                new int[]{R.drawable.one, R.drawable.three, R.drawable.five, R.drawable.six},
                "three",
                new String[]{"one", "three", "five", "six"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.two, R.drawable.four, R.drawable.seven, R.drawable.nine},
                "seven",
                new String[]{"two", "four", "seven", "nine"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.ten, R.drawable.one, R.drawable.seven, R.drawable.eight},
                "ten",
                new String[]{"ten", "one", "seven", "eight"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.three, R.drawable.six, R.drawable.four, R.drawable.nine},
                "six",
                new String[]{"three", "six", "four", "nine"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.eight, R.drawable.two, R.drawable.ten, R.drawable.five},
                "eight",
                new String[]{"eight", "two", "ten", "five"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.one, R.drawable.seven, R.drawable.six, R.drawable.nine},
                "nine",
                new String[]{"one", "seven", "six", "nine"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.three, R.drawable.eight, R.drawable.four, R.drawable.ten},
                "eight",
                new String[]{"three", "eight", "four", "ten"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.one, R.drawable.two, R.drawable.four, R.drawable.six},
                "six",
                new String[]{"one", "two", "four", "six"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.five, R.drawable.nine, R.drawable.eight, R.drawable.three},
                "five",
                new String[]{"five", "nine", "eight", "three"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.two, R.drawable.ten, R.drawable.seven, R.drawable.six},
                "seven",
                new String[]{"two", "ten", "seven", "six"}
        ));

    }

//    private void initQusetion3(){
//        list.add(new TestLesson(
//                new int[]{R.drawable.},
//        ));
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivTest1:
            case R.id.ivTest2:
            case R.id.ivTest3:
            case R.id.ivTest4:
                checkAnswer(view.getContentDescription().toString());
                break;
            case R.id.ivTestSound:
                toSpeech = new TextToSpeech(TestAdapter7.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        toSpeech.setLanguage(Locale.ENGLISH);
                        toSpeech.speak(ivTestSound.getContentDescription().toString(), TextToSpeech.QUEUE_ADD, null);
                    }
                });
                break;
            case R.id.ivTestNext:
                mIndext++;
                if (mIndext < list.size()) {
                    nextQuestion(mIndext);
                }
                nextQuestion(mIndext);
                break;

            default:
                break;

        }

    }

    private void checkAnswer(String text) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sai);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(getApplicationContext(), R.raw.dung);
        if (text.equals(ivTestSound.getContentDescription().toString())) {
            mediaPlayer1.start();
            Toast.makeText(this, "Bạn đã trả lời đúng rồi", Toast.LENGTH_SHORT).show();
            mIndext++;
            if (mIndext < list.size()) {
                nextQuestion(mIndext);
            }
        } else {
            mediaPlayer.start();
            Toast.makeText(this, "Bạn đã trả lời sai rồi", Toast.LENGTH_SHORT).show();
        }

        if (mIndext == list.size() - 1) {
            ivTestNext.setVisibility(View.INVISIBLE);
        }
        if (mIndext == list.size()) {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog);
            TextView tvFinishT1 = dialog.findViewById(R.id.tvFinishT1);
            Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/LHANDW.TTF");
            tvFinishT1.setTypeface(typeface);
            dialog.setCancelable(true);

            ImageView ivdialogtestback = dialog.findViewById(R.id.ivdialogtestback);
            ImageView ivdialogtestnext = dialog.findViewById(R.id.ivdialogtestnext);
            ImageView ivdialogtestexit = dialog.findViewById(R.id.ivdialogtestexit);

            ivdialogtestexit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });

            ivdialogtestnext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    Intent intent = new Intent(TestAdapter7.this, TestAdapter8.class);
                    startActivity(intent);
                }
            });
            ivdialogtestback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(TestAdapter7.this, TestAdapter6.class);
                    startActivity(intent);
                }
            });


            dialog.show();
        }

    }
}
