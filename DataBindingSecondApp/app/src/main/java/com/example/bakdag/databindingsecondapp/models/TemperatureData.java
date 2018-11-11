package com.example.bakdag.databindingsecondapp.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.bakdag.databindingsecondapp.BR;

/**
 * Created by bakdag on 20.12.2017.
 */

public class TemperatureData extends BaseObservable {
    //BaseObservable nesneyi observable yapar.

    private String location;
    private String celsius;

    public TemperatureData(String location, String celsius){
        this.location = location;
        this.celsius = celsius;
    }

    @Bindable // get metoduna ekleyeceğimiz Bindable etiketi BR class' ında bu filed' ı oluşturarak data değiştiğinde notify sağlar.
    public String getLocation() {
        return location;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setLocation(String location) {
        this.location = location;
        //BaseObservable' ın bize sunduğu dört metoddan biri olan notifyPropertyChanged listener' lara belirli bir property' nin değiştiğini bildirir.
        notifyPropertyChanged(BR.location);
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }


}
