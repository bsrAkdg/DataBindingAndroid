package com.example.bakdag.databindingsecondapp.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bakdag.databindingsecondapp.R;
import com.example.bakdag.databindingsecondapp.databinding.ActivityMainBinding;
import com.example.bakdag.databindingsecondapp.interfaces.Presenter;
import com.example.bakdag.databindingsecondapp.interfaces.View;
import com.example.bakdag.databindingsecondapp.models.TemperatureData;
import com.example.bakdag.databindingsecondapp.presenters.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, getApplicationContext());
        TemperatureData temperatureData = new TemperatureData("İstanbul", "10" );
        activityMainBinding.setTemp(temperatureData);
        activityMainBinding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celcius = temperatureData.getCelsius();
        Toast.makeText(this, celcius, Toast.LENGTH_LONG).show();
    }
}
