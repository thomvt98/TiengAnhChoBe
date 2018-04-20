package com.vuthithom.tienganhchobe.main;


import android.app.Activity;
import android.app.Dialog;
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

public class Act_BaiTestMot extends Activity implements View.OnClickListener {
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
        initQuesion1();
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


    private void initQuesion1() {
        list.add(new TestLesson(
                new int[]{R.drawable.zebra, R.drawable.lion, R.drawable.horse, R.drawable.pig},
                "Lion",
                new String[]{"Zebra", "Lion", "Horse", "Pig"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.cat, R.drawable.rabbit, R.drawable.cow},
                "Cat",
                new String[]{"Dog", "Cat", "Rabbit", "Cow"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.rabbit, R.drawable.horse, R.drawable.zebra, R.drawable.tiger},
                "Horse",
                new String[]{"Rabbit", "Horse", "Zebra", "Tiger"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.lion, R.drawable.elephant, R.drawable.goat},
                "Goat",
                new String[]{"Dog", "Lion", "Elephant", "Goat"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.cat, R.drawable.rabbit, R.drawable.cow},
                "Rabbit",
                new String[]{"Dog", "Cat", "Rabbit", "Cow"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.elephant, R.drawable.horse, R.drawable.yak, R.drawable.tiger},
                "Elephant",
                new String[]{"Elephant", "Horse", "Yak", "Tiger"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.cat, R.drawable.rabbit, R.drawable.zebra, R.drawable.pig},
                "Pig",
                new String[]{"Cat", "Rabbit", "Zebra", "Pig"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.tiger, R.drawable.rabbit, R.drawable.cow},
                "Tiger",
                new String[]{"Dog", "Tiger", "Rabbit", "Cow"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.owl, R.drawable.goat, R.drawable.cow, R.drawable.cat},
                "Owl",
                new String[]{"Owl", "Goat", "Cow", "Cat"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.elephant, R.drawable.horse, R.drawable.yak, R.drawable.tiger},
                "Yak",
                new String[]{"Elephant", "Horse", "Yak", "Tiger"}
        ));

    }

    private void initQuseon2() {
        list.add(new TestLesson(
                new int[]{R.drawable.black, R.drawable.blue, R.drawable.orange, R.drawable.white},
                "Blue",
                new String[]{"Black", "Blue", "Orange", "White"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.brown, R.drawable.pink, R.drawable.red, R.drawable.gray},
                "Pink",
                new String[]{"Brown", "Pink", "Red", "Gray"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.green, R.drawable.yellow, R.drawable.blue, R.drawable.white},
                "Yellow",
                new String[]{"Green", "Yellow", "Blue", "White"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.orange, R.drawable.gray, R.drawable.red, R.drawable.black},
                "Orange",
                new String[]{"Orange", "Gray", "Red", "Black"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.red, R.drawable.pink, R.drawable.green, R.drawable.brown},
                "Red",
                new String[]{"Red", "Pink", "Green", "Brown"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.gray, R.drawable.yellow, R.drawable.orange, R.drawable.white},
                "White",
                new String[]{"Gray", "Yellow", "Orange", "White"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.red, R.drawable.blue, R.drawable.orange, R.drawable.white},
                "Blue",
                new String[]{"Black", "Blue", "Orange", "White"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.black, R.drawable.pink, R.drawable.blue, R.drawable.green},
                "Green",
                new String[]{"Black", "Pink", "Blue", "Green"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.green, R.drawable.brown, R.drawable.orange, R.drawable.white},
                "Brown",
                new String[]{"Green", "Brown", "Orange", "White"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.black, R.drawable.blue, R.drawable.orange, R.drawable.white},
                "White",
                new String[]{"Black", "Blue", "Orange", "White"}
        ));

    }

    private void initQuesion3() {
        list.add(new TestLesson(
                new int[]{R.drawable.zebra, R.drawable.lion, R.drawable.horse, R.drawable.pig},
                "Lion",
                new String[]{"Zebra", "Lion", "Horse", "Pig"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.cat, R.drawable.rabbit, R.drawable.cow},
                "Cat",
                new String[]{"Dog", "Cat", "Rabbit", "Cow"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.rabbit, R.drawable.horse, R.drawable.zebra, R.drawable.tiger},
                "Horse",
                new String[]{"Rabbit", "Horse", "Zebra", "Tiger"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.lion, R.drawable.elephant, R.drawable.goat},
                "Goat",
                new String[]{"Dog", "Lion", "Elephant", "Goat"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.cat, R.drawable.rabbit, R.drawable.cow},
                "Rabbit",
                new String[]{"Dog", "Cat", "Rabbit", "Cow"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.elephant, R.drawable.horse, R.drawable.yak, R.drawable.tiger},
                "Elephant",
                new String[]{"Elephant", "Horse", "Yak", "Tiger"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.cat, R.drawable.rabbit, R.drawable.zebra, R.drawable.pig},
                "Pig",
                new String[]{"Cat", "Rabbit", "Zebra", "Pig"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.dog, R.drawable.tiger, R.drawable.rabbit, R.drawable.cow},
                "Tiger",
                new String[]{"Dog", "Tiger", "Rabbit", "Cow"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.owl, R.drawable.goat, R.drawable.cow, R.drawable.cat},
                "Owl",
                new String[]{"Owl", "Goat", "Cow", "Cat"}
        ));
        list.add(new TestLesson(
                new int[]{R.drawable.elephant, R.drawable.horse, R.drawable.yak, R.drawable.tiger},
                "Yak",
                new String[]{"Elephant", "Horse", "Yak", "Tiger"}
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
                toSpeech = new TextToSpeech(Act_BaiTestMot.this, new TextToSpeech.OnInitListener() {
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
            dialog.show();
        }

    }

    private void nextBaiTest() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);
        TextView tvFinishT1 = dialog.findViewById(R.id.tvFinishT1);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/LHANDW.TTF");
        tvFinishT1.setTypeface(typeface);
        dialog.setCancelable(true);
    }

}
