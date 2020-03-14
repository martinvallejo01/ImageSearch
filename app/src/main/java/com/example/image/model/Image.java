package com.example.image.model;

import java.util.Objects;

public class Image {
    private String id;
    private String title;
    private Integer width;
    private Integer height;
    private String src;
    private String url;
    private String potw;

    public Image(String id, String title, Integer width, Integer height, String src, String url, String potw) {
        this.id = id;
        this.title = title;
        this.width = width;
        this.height = height;
        this.src = src;
        this.url = url;
        this.potw = potw;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return width.equals(image.width) &&
                height.equals(image.height) &&
                Objects.equals(id, image.id) &&
                Objects.equals(title, image.title) &&
                Objects.equals(src, image.src) &&
                Objects.equals(url, image.url) &&
                Objects.equals(potw, image.potw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, width, height, src, url, potw);
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
                '}';
    }
}
