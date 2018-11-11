package androidworks.bsrakdg.com.databindingobservableapp.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import androidworks.bsrakdg.com.databindingobservableapp.BR;

public class User extends BaseObservable {

    public String name;
    public String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //To make a property observable, use @Bindable annotation on getter method.
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //Call notifyPropertyChanged(BR.property) in setter method to update the UI whenever the data is changed.
        //The BR class will be generated automatically when data binding is enabled.
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}
