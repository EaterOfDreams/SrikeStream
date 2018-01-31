package com.example.per6.jsontest;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by per6 on 1/12/18.
 */

public interface DataMuseAPI {
//"http://api.dronestre.am"

    @Headers("Accept: application/json")
    @GET("data")
    Call<StrikeResponse> getStrikes();
}