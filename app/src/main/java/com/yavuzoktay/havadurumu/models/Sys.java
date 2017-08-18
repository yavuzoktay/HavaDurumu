package com.yavuzoktay.havadurumu.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sys {

    @SerializedName("type")
    @Expose
    public Integer type;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("message")
    @Expose
    public Float message;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("sunrise")
    @Expose
    public Integer sunrise;
    @SerializedName("sunset")
    @Expose
    public Integer sunset;

    public Sys withType(Integer type) {
        this.type = type;
        return this;
    }

    public Sys withId(Integer id) {
        this.id = id;
        return this;
    }

    public Sys withMessage(Float message) {
        this.message = message;
        return this;
    }

    public Sys withCountry(String country) {
        this.country = country;
        return this;
    }

    public Sys withSunrise(Integer sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public Sys withSunset(Integer sunset) {
        this.sunset = sunset;
        return this;
    }

}