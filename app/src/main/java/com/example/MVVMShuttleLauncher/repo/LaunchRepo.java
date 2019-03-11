package com.example.MVVMShuttleLauncher.repo;

import java.util.Observable;
import java.util.Observer;

public class LaunchRepo extends Observable implements Observer, DataSource {

    private final DataSource localDataSource;
    private final DataSource remoteDataSource;

    public LaunchRepo(DataSource localDataSource, DataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    @Override
    public void getLaunchDate(String date) {
        remoteDataSource.setObserver(this);
        remoteDataSource.getLaunchDate(date);
    }

    @Override
    public void setObserver(Observer observer) {
        addObserver(observer);
    }

    @Override
    public void update(Observable observable, Object result) {
        setChanged();
        notifyObservers(result);
    }
}
