package com.example.image.model;

import android.graphics.Bitmap;

import java.util.Objects;

public class Image {
    private String id;
    private String title;
    private Integer width;
    private Integer height;
    private String src;
    private String url;
    private String potw;
    private Bitmap image;
    private Integer numberOfViews;

    public Image(String id, String title, Integer width, Integer height, String src, String url, String potw) {
        this.id = id;
        this.title = title;
        this.width = width;
        this.height = height;
        this.src = src;
        this.url = url;
        this.potw = potw;
        numberOfViews = 0;
        image = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPotw() {
        return potw;
    }

    public void setPotw(String potw) {
        this.potw = potw;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public void addView() {
        if (numberOfViews == null) {
            numberOfViews = 1;
        } else {
            numberOfViews++;
        }
    }

    public boolean isImageNull() {
        return image == null;
    }

    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image1 = (Image) o;
        return Objects.equals(id, image1.id) &&
                Objects.equals(title, image1.title) &&
                Objects.equals(width, image1.width) &&
                Objects.equals(height, image1.height) &&
                Objects.equals(src, image1.src) &&
                Objects.equals(url, image1.url) &&
                Objects.equals(potw, image1.potw) &&
                Objects.equals(image, image1.image) &&
                Objects.equals(numberOfViews, image1.numberOfViews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, width, height, src, url, potw, image, numberOfViews);
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", src='" + src + '\'' +
                ", url='" + url + '\'' +
                ", potw='" + potw + '\'' +
                ", image=" + image +
                ", numberOfViews=" + numberOfViews +
                '}';
    }
}
