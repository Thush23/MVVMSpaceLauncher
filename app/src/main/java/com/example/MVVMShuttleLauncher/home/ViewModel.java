package com.example.MVVMShuttleLauncher.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.example.MVVMShuttleLauncher.repo.DataSource;
import com.example.MVVMShuttleLauncher.repo.LocalDataSource;
import com.example.MVVMShuttleLauncher.data.Launch;
import com.example.MVVMShuttleLauncher.repo.LaunchRepo;
import com.example.MVVMShuttleLauncher.repo.RemoteDataSource;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ViewModel implements Observer {
    public ViewModel() {
        launchRepository = new LaunchRepo(new LocalDataSource(), new RemoteDataSource());
    }
    private final DataSource launchRepository;

    private final MutableLiveData<List<Launch>> launchLiveData = new MutableLiveData<>();

    public LiveData<List<Launch>> getLaunchLiveData() {
        return launchLiveData;
    }

    public void getLaunches(String value) {
        launchRepository.setObserver(this);
        launchRepository.getLaunchDate(value);
    }

    @Override
    public void update(Observable observable, Object result) {
        List<Launch> launch = (List<Launch>) result;
        launchLiveData.setValue(launch);
    }
}
