package com.example.bakdag.databindingsecondapp.presenters;

import android.content.Context;

import com.example.bakdag.databindingsecondapp.interfaces.Presenter;
import com.example.bakdag.databindingsecondapp.interfaces.View;
import com.example.bakdag.databindingsecondapp.models.TemperatureData;

/**
 * Created by bakdag on 20.12.2017.
 */

public class MainActivityPresenter implements Presenter {
    private View view;
    private Context context;

    public MainActivityPresenter(View view, Context context){
        this.view = view;
        this.context = context;
    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }
}
