package com.vuthithom.tienganhchobe.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.model.Item_Bangchu;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 3/23/2018.
 */

public class BangChuAdapter extends BaseAdapter {
    private ArrayList<Item_Bangchu> listDongvat = new ArrayList<>();
    private Context mcoContext;

    public BangChuAdapter(Context context) {
        mcoContext = context;
        intenData(context);

    }

    private void intenData(Context context) {

        try {
            Bitmap a = BitmapFactory.decodeStream(context.getAssets().open("char_a.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.a));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_b.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.b));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_c.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.c));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_d.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.d));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_e.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.e));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_f.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.f));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_g.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.g));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_h.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.h));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_i.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.i));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_j.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.j));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_k.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.k));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_l.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.l));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_m.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.m));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_n.png"));
            listDongvat.add(new Item_Bangchu(a, R.drawable.n));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_o.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.o));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_p.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.p));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_q.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.q));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_r.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.r));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_s.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.s));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_t.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.t));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_u.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.u));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_v.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.v));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_w.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.w));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_x.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.x));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_y.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.y));
            a = BitmapFactory.decodeStream(context.getAssets().open("char_z.png"));
            listDongvat.add(new Item_Bangchu(a, R.raw.z));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getCount() {
        return listDongvat.size();
    }

    @Override
    public Object getItem(int position) {
        return listDongvat.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            convertView = View.inflate(mcoContext, R.layout.item_bangchu, null);
        }
        ImageView ivbangchu = convertView.findViewById(R.id.iv_bangchu);
        Item_Bangchu item = listDongvat.get(position);
        ivbangchu.setImageBitmap(item.getBitmap());

        return convertView;
    }
}
