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

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmNumberOfViews() {
        return mNumberOfViews;
    }

    public void setmNumberOfViews(Integer mNumberOfViews) {
        this.mNumberOfViews = mNumberOfViews;
    }

    public Bitmap getmBitmap() {
        return mBitmap;
    }

    public void setmBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }


}
