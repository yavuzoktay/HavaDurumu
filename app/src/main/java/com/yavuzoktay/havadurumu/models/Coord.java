package com.yavuzoktay.havadurumu.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coord {

    @SerializedName("lon")
    @Expose
    public Float lon;
    @SerializedName("lat")
    @Expose
    public Float lat;

    public Coord withLon(Float lon) {
        this.lon = lon;
        return this;
    }

    public Coord withLat(Float lat) {
        this.lat = lat;
        return this;
    }

}