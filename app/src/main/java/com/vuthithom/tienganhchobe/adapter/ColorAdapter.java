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
import com.vuthithom.tienganhchobe.model.Item_Bangchu;
import com.vuthithom.tienganhchobe.model.Item_Color;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 3/25/2018.
 */

public class ColorAdapter extends BaseAdapter {
    private ArrayList<Item_Color> listColor = new ArrayList<>();
    private Context mcoContext;

    public ColorAdapter(Context context) {
        mcoContext = context;
        intenData(context);

    }

    private void intenData(Context context) {
        try {
            Bitmap pink = BitmapFactory.decodeStream(context.getAssets().open("pink.jpg"));
            listColor.add(new Item_Color("Pink", "Màu hồng", pink, R.raw.pink));
            pink = BitmapFactory.decodeStream(context.getAssets().open("blue.png"));
            listColor.add(new Item_Color("Blue", "Màu xanh nước biển", pink, R.raw.blue));
            pink = BitmapFactory.decodeStream(context.getAssets().open("black.png"));
            listColor.add(new Item_Color("Black", "Màu đen", pink, R.raw.black));
            pink = BitmapFactory.decodeStream(context.getAssets().open("green.png"));
            listColor.add(new Item_Color("Green", "Màu xanh lá cây", pink, R.raw.green));
            pink = BitmapFactory.decodeStream(context.getAssets().open("brown.png"));
            listColor.add(new Item_Color("Brown", "Màu nâu", pink, R.raw.grey));
            pink = BitmapFactory.decodeStream(context.getAssets().open("orange.png"));
            listColor.add(new Item_Color("Orange", "Màu cam", pink, R.raw.orange));
            pink = BitmapFactory.decodeStream(context.getAssets().open("white.png"));
            listColor.add(new Item_Color("White", "Màu trắng", pink, R.raw.white));
            pink = BitmapFactory.decodeStream(context.getAssets().open("red.png"));
            listColor.add(new Item_Color("Red", "Màu đỏ", pink, R.raw.red));
            pink = BitmapFactory.decodeStream(context.getAssets().open("yellow.png"));
            listColor.add(new Item_Color("Yellow", "Màu vàng", pink, R.raw.eyllow));
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

            convertView = View.inflate(mcoContext, R.layout.item_color, null);
        }
        ImageView ivcolorBlack = convertView.findViewById(R.id.iv_colorBlack);
        TextView tvcolorBlack = convertView.findViewById(R.id.tv_colorBlack);
        TextView tvcolorDen = convertView.findViewById(R.id.tv_colorDen);
        Item_Color item = listColor.get(position);
        ivcolorBlack.setImageBitmap(item.getBitmap());
        tvcolorBlack.setText(item.getNameE());
        tvcolorDen.setText(item.getNameV());

        Typeface typeface = Typeface.createFromAsset(mcoContext.getAssets(), "fonts/FORTE.TTF");
        tvcolorBlack.setTypeface(typeface);
        tvcolorDen.setTypeface(typeface);

        return convertView;
    }
}
