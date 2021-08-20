package com.example.dogstagram.DOG_Model_Lists;

import com.google.gson.annotations.SerializedName;

public class Weight {

    @SerializedName("metric")
    private String weight;

    public String get_Weight() {
        return weight;
    }

    public Weight(String weight) {
        this.weight = weight;
    }
}
