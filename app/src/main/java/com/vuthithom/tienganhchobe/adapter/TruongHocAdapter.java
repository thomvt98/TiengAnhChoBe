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
import com.vuthithom.tienganhchobe.model.Item_TruongHoc;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vuthithom on 4/1/2018.
 */

public class TruongHocAdapter extends BaseAdapter {
    private ArrayList<Item_TruongHoc> listColor = new ArrayList<>();
    private Context mcoContext;

    public TruongHocAdapter(Context context) {
        mcoContext = context;
        intenData(context);

    }

    private void intenData(Context context) {
        try {
            Bitmap book = BitmapFactory.decodeStream(context.getAssets().open("truonghoc/book.png"));
            listColor.add(new Item_TruongHoc("Book", "Sách", book, R.raw.book));
            book = BitmapFactory.decodeStream(context.getAssets().open("truonghoc/board.png"));
            listColor.add(new Item_TruongHoc("Board", "", book, R.raw.board));
            book = BitmapFactory.decodeStream(context.getAssets().open("truonghoc/eraser.png"));
            listColor.add(new Item_TruongHoc("Eraser", "Cục Tẩy", book, R.raw.maps));
            book = BitmapFactory.decodeStream(context.getAssets().open("truonghoc/pencil.png"));
            listColor.add(new Item_TruongHoc("Pencil", "Bút Chì", book, R.raw.notebook));
            book = BitmapFactory.decodeStream(context.getAssets().open("truonghoc/ruler.png"));
            listColor.add(new Item_TruongHoc("Ruler", "Thước Kẻ", book, R.raw.ruler));
            book = BitmapFactory.decodeStream(context.getAssets().open("truonghoc/truonghoc.png"));
            listColor.add(new Item_TruongHoc("Student", "Học Sinh", book, R.raw.student));

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

            convertView = View.inflate(mcoContext, R.layout.item_truonghoc, null);
        }
        ImageView ivcolorBlack = convertView.findViewById(R.id.iv_truonghoc);
        TextView tvcolorBlack = convertView.findViewById(R.id.tv_truonghoce);
        TextView tvcolorDen = convertView.findViewById(R.id.tv_truonghocv);
        Item_TruongHoc item = listColor.get(position);
        ivcolorBlack.setImageBitmap(item.getBitmap());
        tvcolorBlack.setText(item.getNameE());
        tvcolorDen.setText(item.getNameV());

        Typeface typeface = Typeface.createFromAsset(mcoContext.getAssets(), "fonts/FORTE.TTF");
        tvcolorBlack.setTypeface(typeface);
        tvcolorDen.setTypeface(typeface);

        return convertView;
    }
}
