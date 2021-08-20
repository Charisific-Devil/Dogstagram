package com.example.dogstagram.DOG_Model_Lists;

import com.google.gson.annotations.SerializedName;

public class Height {

    @SerializedName("metric")
    private String height;

    public String get_Height() {
        return height;
    }

    public Height(String height) {
        this.height = height;
    }
}
