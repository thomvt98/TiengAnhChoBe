package com.vuthithom.tienganhchobe.model;

import android.graphics.Bitmap;

/**
 * Created by vuthithom on 3/28/2018.
 */

public class Item_Hoa {
    private String nameE, nameV;
    private Bitmap bitmap;
    private int mp3;

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getNameV() {
        return nameV;
    }

    public void setNameV(String nameV) {
        this.nameV = nameV;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getMp3() {
        return mp3;
    }

    public void setMp3(int mp3) {
        this.mp3 = mp3;
    }

    public Item_Hoa(String nameE, String nameV, Bitmap bitmap, int mp3) {

        this.nameE = nameE;
        this.nameV = nameV;
        this.bitmap = bitmap;
        this.mp3 = mp3;
    }
}
