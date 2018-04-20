package com.vuthithom.tienganhchobe.model;

import android.graphics.Bitmap;

/**
 * Created by vuthithom on 4/1/2018.
 */

public class Item_QuocGia {
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

    public Item_QuocGia(String nameE, String nameV, Bitmap bitmap, int mp3) {

        this.nameE = nameE;
        this.nameV = nameV;
        this.bitmap = bitmap;
        this.mp3 = mp3;
    }
}
