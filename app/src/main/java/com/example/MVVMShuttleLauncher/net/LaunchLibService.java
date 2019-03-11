package com.example.MVVMShuttleLauncher.net;

import com.example.MVVMShuttleLauncher.Constants;
import com.example.MVVMShuttleLauncher.data.ShuttleLaunchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LaunchLibService {

    @GET(Constants.ENDPOINT)
    Call<ShuttleLaunchResponse> ShuttleLaunchDate(@Path("date") String date);
}
