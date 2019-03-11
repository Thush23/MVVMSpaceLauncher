package com.example.MVVMShuttleLauncher;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.MVVMShuttleLauncher.home.ViewModel;
import com.example.shuttlelaunchesmvvm.R;
import com.example.MVVMShuttleLauncher.data.Launch;
import com.example.MVVMShuttleLauncher.home.LaunchesAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnLaunch);
        final RecyclerView recyclerView = findViewById(R.id.rvLaunchDetails);
        final EditText etDate = findViewById(R.id.etDate);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                linearLayoutManager.getOrientation()));
        
        final LaunchesAdapter launchesAdapter = new LaunchesAdapter();
        recyclerView.setAdapter(launchesAdapter);

        final ViewModel homeViewModel = new ViewModel();
        homeViewModel.getLaunchLiveData().observe(this,
                new Observer<List<Launch>>(){

            @Override
            public void onChanged(@Nullable List<Launch> launches) {
                launchesAdapter.setData(launches);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeViewModel.getLaunches(etDate.getText().toString());
            }
        });

    }
}
