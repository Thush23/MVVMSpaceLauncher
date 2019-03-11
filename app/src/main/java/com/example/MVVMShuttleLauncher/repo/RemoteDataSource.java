package com.example.MVVMShuttleLauncher.repo;

import com.example.MVVMShuttleLauncher.Constants;
import com.example.MVVMShuttleLauncher.data.Launch;
import com.example.MVVMShuttleLauncher.data.ShuttleLaunchResponse;
import com.example.MVVMShuttleLauncher.net.LaunchLibService;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteDataSource extends Observable implements DataSource {

    private final LaunchLibService launchLibService;

    public RemoteDataSource() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        launchLibService = retrofit.create(LaunchLibService.class);

    }

    @Override
    public void getLaunchDate(String date) {
        final List<Launch> launch = new ArrayList<>();
        launchLibService.ShuttleLaunchDate(date)
                .enqueue(new Callback<ShuttleLaunchResponse>() {
                    @Override
                    public void onResponse(Call<ShuttleLaunchResponse> call, Response<ShuttleLaunchResponse> response) {
                        if (response.isSuccessful() && response.body().getLaunches() != null) {
                            launch.clear();
                            launch.addAll(response.body().getLaunches());
                            setChanged();
                            notifyObservers(launch);
                        }
                    }

                    @Override
                    public void onFailure(Call<ShuttleLaunchResponse> call, Throwable t) {
                        t.printStackTrace();
                    }
                });

    }

    @Override
    public void setObserver(Observer observer) {
        addObserver(observer);
    }
}
