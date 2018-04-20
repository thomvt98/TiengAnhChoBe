package com.vuthithom.tienganhchobe.model;

import android.graphics.Bitmap;

/**
 * Created by vuthithom on 3/28/2018.
 */

public class Item_SoDem {
    private Bitmap bitmap;
    private int mp3;

    public Item_SoDem(Bitmap bitmap, int mp3) {
        this.bitmap = bitmap;
        this.mp3 = mp3;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getMp3() {
        return mp3;
    }
}
