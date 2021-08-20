package com.example.dogstagram.DOG_Model_Lists;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImageAnalysis {

    @SerializedName("labels")
    private List<Labels> labels;

    public ImageAnalysis(List<Labels> labels) {
        this.labels = labels;
    }

    public List<Labels> getLabels() {
        return labels;
    }
}
