package com.example.image.model;

import android.graphics.Bitmap;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DownloadedImage that = (DownloadedImage) o;
        return Objects.equals(mId, that.mId) &&
                Objects.equals(mNumberOfViews, that.mNumberOfViews) &&
                Objects.equals(mBitmap, that.mBitmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mId, mNumberOfViews, mBitmap);
    }

    @Override
    public String toString() {
        return "DownloadedImage{" +
                "mId=" + mId +
                ", mNumberOfViews=" + mNumberOfViews +
                ", mBitmap=" + mBitmap +
                '}';
    }
}
