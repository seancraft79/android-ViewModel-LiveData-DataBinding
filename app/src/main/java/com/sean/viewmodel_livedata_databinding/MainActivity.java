package com.sean.viewmodel_livedata_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.sean.viewmodel_livedata_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        CounterViewModel counterViewModel = ViewModelProviders.of(this).get(CounterViewModel.class);

    }
}
