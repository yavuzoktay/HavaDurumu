package com.yavuzoktay.havadurumu.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clouds {

    @SerializedName("all")
    @Expose
    public Integer all;

    public Clouds withAll(Integer all) {
        this.all = all;
        return this;
    }

}