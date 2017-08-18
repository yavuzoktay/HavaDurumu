package com.yavuzoktay.havadurumu.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    @Expose
    public Float speed;
    @SerializedName("deg")
    @Expose
    public Integer deg;

    public Wind withSpeed(Float speed) {
        this.speed = speed;
        return this;
    }

    public Wind withDeg(Integer deg) {
        this.deg = deg;
        return this;
    }

}


