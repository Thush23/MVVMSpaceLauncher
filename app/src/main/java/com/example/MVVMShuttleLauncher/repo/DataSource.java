package com.example.MVVMShuttleLauncher.repo;

import java.util.Observer;

public interface DataSource {
    void getLaunchDate(String date);
    void setObserver(Observer observer);
}
