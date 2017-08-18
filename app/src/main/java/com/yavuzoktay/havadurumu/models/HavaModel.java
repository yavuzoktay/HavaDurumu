package com.yavuzoktay.havadurumu.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HavaModel {

    @SerializedName("coord")
    @Expose
    public Coord coord;
    @SerializedName("weather")
    @Expose
    public List<Weather> weather = null;
    @SerializedName("base")
    @Expose
    public String base;
    @SerializedName("main")
    @Expose
    public Main main;
    @SerializedName("visibility")
    @Expose
    public Integer visibility;
    @SerializedName("wind")
    @Expose
    public Wind wind;
    @SerializedName("clouds")
    @Expose
    public Clouds clouds;
    @SerializedName("dt")
    @Expose
    public Integer dt;
    @SerializedName("sys")
    @Expose
    public Sys sys;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("cod")
    @Expose
    public Integer cod;

    public HavaModel withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    public HavaModel withWeather(List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    public HavaModel withBase(String base) {
        this.base = base;
        return this;
    }

    public HavaModel withMain(Main main) {
        this.main = main;
        return this;
    }

    public HavaModel withVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }

    public HavaModel withWind(Wind wind) {
        this.wind = wind;
        return this;
    }

    public HavaModel withClouds(Clouds clouds) {
        this.clouds = clouds;
        return this;
    }

    public HavaModel withDt(Integer dt) {
        this.dt = dt;
        return this;
    }

    public HavaModel withSys(Sys sys) {
        this.sys = sys;
        return this;
    }

    public HavaModel withId(Integer id) {
        this.id = id;
        return this;
    }

    public HavaModel withName(String name) {
        this.name = name;
        return this;
    }

    public HavaModel withCod(Integer cod) {
        this.cod = cod;
        return this;
    }

}