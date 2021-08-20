package com.example.dogstagram.DOG_Model_Lists;

import com.google.gson.annotations.SerializedName;

public class ImageURL {

    @SerializedName("url")
    private String imgUrl;

    public ImageURL(String mimgUrl)
    {
        imgUrl = mimgUrl;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }
}
