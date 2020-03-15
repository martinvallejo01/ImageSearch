package com.example.image.model;

import android.graphics.Bitmap;

public class DownloadedImage {
    Integer mId;
    Integer mNumberOfViews;
    Bitmap mBitmap;

    public DownloadedImage(Integer mId, Integer mNumberOfViews, Bitmap mBitmap) {
        this.mId = mId;
        this.mNumberOfViews = mNumberOfViews;
        this.mBitmap = mBitmap;
    }

    public DownloadedImage(Integer mId, Bitmap mBitmap) {
        this.mId = mId;
        this.mBitmap = mBitmap;
        mNumberOfViews = 1;
    }

    public Integer getId() {
        return mId;
    }

    public void setId(Integer mId) {
        this.mId = mId;
    }

    public Integer getNumberOfViews() {
        return mNumberOfViews;
    }

    public void setNumberOfViews(Integer mNumberOfViews) {
        this.mNumberOfViews = mNumberOfViews;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }


}
