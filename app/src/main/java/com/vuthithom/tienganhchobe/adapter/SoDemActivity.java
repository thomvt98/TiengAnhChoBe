package com.vuthithom.tienganhchobe.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.model.Item_Bangchu;
import com.vuthithom.tienganhchobe.model.Item_SoDem;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 3/28/2018.
 */

public class SoDemActivity extends BaseAdapter {
    private ArrayList<Item_SoDem> item_soDem = new ArrayList<>();
    private Context mcoContext;

    public SoDemActivity(Context context) {
        mcoContext = context;
        intenData(context);

    }

    private void intenData(Context context) {

        try {
            Bitmap one = BitmapFactory.decodeStream(context.getAssets().open("so/one.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.one));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/two.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.two));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/three.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.three));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/four.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.four));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/five.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.five));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/six.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.six));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/seven.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.seven));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/eight.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.einght));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/nine.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.nine));
            one = BitmapFactory.decodeStream(context.getAssets().open("so/ten.png"));
            item_soDem.add(new Item_SoDem(one, R.raw.ten));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getCount() {
        return item_soDem.size();
    }

    @Override
    public Object getItem(int position) {
        return item_soDem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            convertView = View.inflate(mcoContext, R.layout.item_sodem, null);
        }
        ImageView ivbangchu = convertView.findViewById(R.id.iv_sodem);
//        TextView tvbangchu = convertView.findViewById(R.id.tv_bangchu);
        Item_SoDem item = item_soDem.get(position);
        ivbangchu.setImageBitmap(item.getBitmap());

        return convertView;
    }
}
