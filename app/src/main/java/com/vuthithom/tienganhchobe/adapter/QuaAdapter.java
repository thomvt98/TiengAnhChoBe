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
import com.vuthithom.tienganhchobe.model.Item_Color;
import com.vuthithom.tienganhchobe.model.Item_Qua;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 4/1/2018.
 */

public class QuaAdapter extends BaseAdapter {
    private ArrayList<Item_Qua> listColor = new ArrayList<>();
    private Context mcoContext;

    public QuaAdapter(Context context) {
        mcoContext = context;
        intenData(context);

    }

    private void intenData(Context context) {
        try {
            Bitmap pink = BitmapFactory.decodeStream(context.getAssets().open("qua/dua.png"));
            listColor.add(new Item_Qua("coconut", "Qủa Dừa", pink, R.raw.coconut));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/dudu.png"));
            listColor.add(new Item_Qua("papaya", "Qủa Đu Đủ", pink, R.raw.papaya));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/ot.png"));
            listColor.add(new Item_Qua("chili Peppers", "Qủa Ớt", pink, R.raw.chilipeppers));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quabuoi.png"));
            listColor.add(new Item_Qua("grapefruit", "Qủa Bưởi", pink, R.raw.grapefruit));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quacam.png"));
            listColor.add(new Item_Qua("Orange", "Qủa Cam", pink, R.raw.orange));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quachuoi.png"));
            listColor.add(new Item_Qua("banana", "Qủa Chuối", pink, R.raw.banana));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quadao.png"));
            listColor.add(new Item_Qua("peaches", "Qủa Đào", pink, R.raw.peaches));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quadautay.png"));
            listColor.add(new Item_Qua("Strawberry", "Qủa Dâu Tây", pink, R.raw.strawberry));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quaduahau.png"));
            listColor.add(new Item_Qua("watermelon", "Qủa Dưa Hấu", pink, R.raw.watermelon));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/qualuu.png"));
            listColor.add(new Item_Qua("Pomegranate", "Qủa Lựu", pink, R.raw.pomegranate));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quanho.png"));
            listColor.add(new Item_Qua("grape", "Qủa Nho", pink, R.raw.grape));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quatao.png"));
            listColor.add(new Item_Qua("Apple", "Qủa Táo", pink, R.raw.apple));
            pink = BitmapFactory.decodeStream(context.getAssets().open("qua/quaxoai.png"));
            listColor.add(new Item_Qua("Mangoes", "Qủa Xoài", pink, R.raw.mangoes));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getCount() {
        return listColor.size();
    }

    @Override
    public Object getItem(int position) {
        return listColor.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            convertView = View.inflate(mcoContext, R.layout.item_qua, null);
        }
        ImageView ivcolorBlack = convertView.findViewById(R.id.iv_qua);
        TextView tvcolorBlack = convertView.findViewById(R.id.tv_quae);
        TextView tvcolorDen = convertView.findViewById(R.id.tv_quav);
        Item_Qua item = listColor.get(position);
        ivcolorBlack.setImageBitmap(item.getBitmap());
        tvcolorBlack.setText(item.getNameE());
        tvcolorDen.setText(item.getNameV());

        Typeface typeface = Typeface.createFromAsset(mcoContext.getAssets(), "fonts/FORTE.TTF");
        tvcolorBlack.setTypeface(typeface);
        tvcolorDen.setTypeface(typeface);

        return convertView;
    }
}
