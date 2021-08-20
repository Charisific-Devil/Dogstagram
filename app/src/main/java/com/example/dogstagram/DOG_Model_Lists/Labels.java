package com.example.dogstagram.DOG_Model_Lists;

import com.google.gson.annotations.SerializedName;

public class Labels {

    @SerializedName("Name")
    private String name;

    @SerializedName("Confidence")
    private String cofidence;

    public Labels(String name, String cofidence) {
        this.name = name;
        this.cofidence = cofidence;
    }

    public String getName() {
        return name;
    }

    public String getCofidence() {
        return cofidence;
    }
}
