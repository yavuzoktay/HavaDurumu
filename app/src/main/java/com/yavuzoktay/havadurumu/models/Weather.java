package com.yavuzoktay.havadurumu.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("main")
    @Expose
    public String main;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("icon")
    @Expose
    public String icon;

    public Weather withId(Integer id) {
        this.id = id;
        return this;
    }

    public Weather withMain(String main) {
        this.main = main;
        return this;
    }

    public Weather withDescription(String description) {
        this.description = description;
        return this;
    }

    public Weather withIcon(String icon) {
        this.icon = icon;
        return this;
    }

}