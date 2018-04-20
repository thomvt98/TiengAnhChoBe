package com.vuthithom.tienganhchobe.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.model.Item_DongVat;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 3/27/2018.
 */

public class DongVatAdapTer extends BaseAdapter {
    private ArrayList<Item_DongVat> listDongVat = new ArrayList<>();
    private Context ncontext;

    public DongVatAdapTer(Context context) {
        ncontext = context;
        intenn(context);
    }

    private void intenn(Context context) {
        try {
            Bitmap cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/cat.png"));
            listDongVat.add(new Item_DongVat("cat", "Con Mèo", cat, R.raw.cat));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/cow.png"));
            listDongVat.add(new Item_DongVat("Cow", "Bò sữa", cat, R.raw.cow));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/dog.png"));
            listDongVat.add(new Item_DongVat("Dog", "Con Chó", cat, R.raw.dog));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/elephant.png"));
            listDongVat.add(new Item_DongVat("Elephant", "Con Voi", cat, R.raw.elephant));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/fish.png"));
            listDongVat.add(new Item_DongVat("Fish", "Con Cá", cat, R.raw.fish));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/fox.png"));
            listDongVat.add(new Item_DongVat("Fox", "Con Cáo", cat, R.raw.fox));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/goat.png"));
            listDongVat.add(new Item_DongVat("Goat", "Con Dê", cat, R.raw.goat));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/horse.png"));
            listDongVat.add(new Item_DongVat("Horse", "Con Ngựa", cat, R.raw.horse));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/lion.png"));
            listDongVat.add(new Item_DongVat("Lion", "Con Sư Tử", cat, R.raw.lion));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/owl.png"));
            listDongVat.add(new Item_DongVat("Owl", " Cú Mèo", cat, R.raw.owl));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/parrot.png"));
            listDongVat.add(new Item_DongVat("Parrot", "Con Vẹt", cat, R.raw.parrot));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/pig.png"));
            listDongVat.add(new Item_DongVat("Pig", "Con Lợn", cat, R.raw.pig));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/rabbit.png"));
            listDongVat.add(new Item_DongVat("Rabbit", "Con Chuột ", cat, R.raw.rabbit));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/tiger.png"));
            listDongVat.add(new Item_DongVat("Tiger", "Con Hổ", cat, R.raw.tiger));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/yak.png"));
            listDongVat.add(new Item_DongVat("Yak", "Tê rác", cat, R.raw.yak));
            cat = BitmapFactory.decodeStream(context.getAssets().open("dongvat/zebra.png"));
            listDongVat.add(new Item_DongVat("Zebra", "Ngựa vằn", cat, R.raw.zebra));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getCount() {
        return listDongVat.size();
    }

    @Override
    public Object getItem(int i) {
        return listDongVat.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {

            view = View.inflate(ncontext, R.layout.item_dongvat, null);
        }
        ImageView ivnumber = view.findViewById(R.id.iv_dongvat);
        TextView tvnumberE = view.findViewById(R.id.tv_dv);
        TextView tvnumberV = view.findViewById(R.id.tv_dongvat);
        Item_DongVat item = listDongVat.get(i);
        ivnumber.setImageBitmap(item.getBitmap());
        tvnumberE.setText(item.getNameE());
        tvnumberV.setText(item.getNameV());
        Typeface typeface = Typeface.createFromAsset(ncontext.getAssets(), "fonts/FORTE.TTF");
        tvnumberE.setTypeface(typeface);
        tvnumberV.setTypeface(typeface);
        return view;
    }
}
