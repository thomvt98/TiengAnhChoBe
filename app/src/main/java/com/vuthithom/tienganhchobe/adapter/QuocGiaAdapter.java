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
import com.vuthithom.tienganhchobe.model.Item_QuocGia;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 4/1/2018.
 */

public class QuocGiaAdapter extends BaseAdapter {
    private ArrayList<Item_QuocGia> listColor = new ArrayList<>();
    private Context mcoContext;

    public QuocGiaAdapter(Context context) {
        mcoContext = context;
        intenData(context);

    }

    private void intenData(Context context) {
        try {
            Bitmap vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/vietnamm.png"));
            listColor.add(new Item_QuocGia("Việt Nam", "Việt Nam", vietnam, R.raw.vietnam));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/argentian.png"));
            listColor.add(new Item_QuocGia("Argentian", "", vietnam, R.raw.argentian));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/brazil.png"));
            listColor.add(new Item_QuocGia("Brazil", "", vietnam, R.raw.brazli));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/croatia.png"));
            listColor.add(new Item_QuocGia("Croatia", "", vietnam, R.raw.croatia));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/cuba.png"));
            listColor.add(new Item_QuocGia("Cuba", "", vietnam, R.raw.cuba));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/finland.png"));
            listColor.add(new Item_QuocGia("Finland", "", vietnam, R.raw.finland));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/belgium.png"));
            listColor.add(new Item_QuocGia("Belgium", "", vietnam, R.raw.belgium));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/lao.png"));
            listColor.add(new Item_QuocGia("Laos", "", vietnam, R.raw.laos));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/netherlands.png"));
            listColor.add(new Item_QuocGia("Netherlands", "", vietnam, R.raw.netherlands));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/rossiya.png"));
            listColor.add(new Item_QuocGia("Rossiya", "", vietnam, R.raw.rossiya));
            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/singaporo.png"));
            listColor.add(new Item_QuocGia("Singapore", "", vietnam, R.raw.singapore));

            vietnam = BitmapFactory.decodeStream(context.getAssets().open("quocgia/zimbabwe.png"));
            listColor.add(new Item_QuocGia("Zimbabwe", "", vietnam, R.raw.zimbabwe));
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

            convertView = View.inflate(mcoContext, R.layout.item_quocgia, null);
        }
        ImageView ivcolorBlack = convertView.findViewById(R.id.iv_quocgia);
        TextView tvcolorBlack = convertView.findViewById(R.id.tv_quocgiae);
        TextView tvcolorDen = convertView.findViewById(R.id.tv_quocgiav);
        Item_QuocGia item = listColor.get(position);
        ivcolorBlack.setImageBitmap(item.getBitmap());
        tvcolorBlack.setText(item.getNameE());
        tvcolorDen.setText(item.getNameV());

        Typeface typeface = Typeface.createFromAsset(mcoContext.getAssets(), "fonts/FORTE.TTF");
        tvcolorBlack.setTypeface(typeface);
        tvcolorDen.setTypeface(typeface);

        return convertView;
    }
}
