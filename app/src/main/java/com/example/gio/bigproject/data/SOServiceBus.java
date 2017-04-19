package com.example.gio.bigproject.data;

import com.example.gio.bigproject.data.model.SOStationsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Copyright by Gio.
 * Created on 4/5/2017.
 */

public interface SOServiceBus {
    double LATITUDE = 16.08;
    double LONGITUDE = 108.22;
    String QUERY = "tram xe buyt";

    @GET("json?query=" + QUERY + "&location=" + LATITUDE +"," + LONGITUDE + "&key=AIzaSyBKZMuAEviAoJsNpLzJwB0OG3M4emjI_a8")
    Call<SOStationsResponse> getAnswers();
}
