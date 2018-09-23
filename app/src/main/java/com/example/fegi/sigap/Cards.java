package com.example.fegi.sigap;

/**
 * Created by Fegi on 9/6/2018.
 */

public class Cards {
    private String imgURL;
    private String title;

    public Cards(String imgURL, String title) {
        this.imgURL = imgURL;
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {

        this.imgURL = imgURL;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
