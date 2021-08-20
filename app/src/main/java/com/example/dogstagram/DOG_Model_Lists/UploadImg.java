package com.example.dogstagram.DOG_Model_Lists;

import com.google.gson.annotations.SerializedName;

public class UploadImg {
    @SerializedName("id")
    private String id;

    public UploadImg(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
