package com.vuthithom.tienganhchobe.model;

/**
 * Created by vuthithom on 4/9/2018.
 */

public class Item_YouTuBe {
    private String Title;
    private String Thumbnail;
    private String IdVideo;

    public Item_YouTuBe(String title, String thumbnail, String idVideo) {
        Title = title;
        Thumbnail = thumbnail;
        IdVideo = idVideo;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getIdVideo() {
        return IdVideo;
    }

    public void setIdVideo(String idVideo) {
        IdVideo = idVideo;
    }
}
