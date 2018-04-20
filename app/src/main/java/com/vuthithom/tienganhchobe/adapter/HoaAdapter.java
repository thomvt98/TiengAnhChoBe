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
import com.vuthithom.tienganhchobe.model.Item_Hoa;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 3/28/2018.
 */

public class HoaAdapter extends BaseAdapter {
    private ArrayList<Item_Hoa> listhoa = new ArrayList<>();
    private Context mcoContext;

    public HoaAdapter(Context context) {
        mcoContext = context;
        intenData(context);

    }

    private void intenData(Context context) {
        try {
            Bitmap pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/anhdao.png"));
            listhoa.add(new Item_Hoa("Cherry Blossom", "Hoa anh đào", pink, R.raw.cherryblossom));
            pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/hoaphuong.png"));
            listhoa.add(new Item_Hoa("Phoenix", "Hoa Phượng", pink, R.raw.phoenix));
            pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/hoamai.png"));
            listhoa.add(new Item_Hoa("Apricot Blossom", "Hoa anh đào", pink, R.raw.apricotblossom));
            pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/cuc.png"));
            listhoa.add(new Item_Hoa("Chrysanthemum", "Hoa Mai", pink, R.raw.chrysanthemum));
            pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/hoahong.png"));
            listhoa.add(new Item_Hoa("Rose", "Hoa Hồng", pink, R.raw.rose));
            pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/hoasen.png"));
            listhoa.add(new Item_Hoa("Lotus Flower", "Hoa Sen", pink, R.raw.lotusflower));
            pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/lan.png"));
            listhoa.add(new Item_Hoa("Orchid", "Hoa Lan", pink, R.raw.orchid));
            pink = BitmapFactory.decodeStream(context.getAssets().open("hoa/ly.png"));
            listhoa.add(new Item_Hoa("Flower Cups", "Hoa Ly", pink, R.raw.flowercups));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getCount() {
        return listhoa.size();
    }

    @Override
    public Object getItem(int position) {
        return listhoa.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            convertView = View.inflate(mcoContext, R.layout.item_hoa, null);
        }
        ImageView ivcolorBlack = convertView.findViewById(R.id.iv_hoa);
        TextView tvcolorBlack = convertView.findViewById(R.id.tv_hoae);
        TextView tvcolorDen = convertView.findViewById(R.id.tv_hoav);
        Item_Hoa item = listhoa.get(position);
        ivcolorBlack.setImageBitmap(item.getBitmap());
        tvcolorBlack.setText(item.getNameE());
        tvcolorDen.setText(item.getNameV());

        Typeface typeface = Typeface.createFromAsset(mcoContext.getAssets(), "fonts/FORTE.TTF");
        tvcolorBlack.setTypeface(typeface);
        tvcolorDen.setTypeface(typeface);

        return convertView;
    }
}
