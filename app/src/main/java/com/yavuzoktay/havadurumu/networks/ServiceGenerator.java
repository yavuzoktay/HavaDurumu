package com.yavuzoktay.havadurumu.networks;

import com.yavuzoktay.havadurumu.models.HavaModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Yavuz on 13.8.2017.
 */

public interface ServiceGenerator {

    @GET("/data/2.5/weather")
    Call<HavaModel> havaModel(@Query("q") String il, @Query("APPID") String api);

}
