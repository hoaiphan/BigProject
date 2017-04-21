package com.example.gio.bigproject;

import android.util.Log;

import com.example.gio.bigproject.data.ApiUtilsBus;
import com.example.gio.bigproject.data.SOServiceBus;
import com.example.gio.bigproject.model.bus_stop.Result;
import com.example.gio.bigproject.model.bus_stop.SOStationsResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Copyright by Gio.
 * Created on 4/14/2017.
 */

class MockData {

    private static final ArrayList<Result> mResults = new ArrayList<>();
    // Get data from Json
    private static SOServiceBus mService = ApiUtilsBus.getSOService();
    public static int RESULT_COUNT;

    public static void createData() {
        mService.getBusStop("tram xe buyt", "16.08,108.22", ApiUtilsBus.KEY)
                .enqueue(new Callback<SOStationsResponse>() {
            @Override
            public void onResponse(Call<SOStationsResponse> call, Response<SOStationsResponse> response) {

                if (response.isSuccessful()) {
                    if (mResults.size() != 0) {
                        mResults.clear();
                    }
                    mResults.addAll(response.body().getResults());
                    RESULT_COUNT = mResults.size();
                    Log.d("loadData", "onResponse: " + RESULT_COUNT);
                } else {
                    Log.d("MockData", "posts didn't load from API: ");
                }
            }

            @Override
            public void onFailure(Call<SOStationsResponse> call, Throwable t) {
                Log.d("", "onFailure: " + call.request().url().toString());
                Log.d("MockData", "error loading from API");
            }
        });

        Log.d("MockData", "posts loaded from API " + mResults.size() + " count = " + MockData.RESULT_COUNT);
    }

    public static ArrayList<Result> getData() {
        return mResults;
    }
}