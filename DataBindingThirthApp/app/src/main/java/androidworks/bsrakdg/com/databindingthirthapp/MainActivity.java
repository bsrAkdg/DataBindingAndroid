package androidworks.bsrakdg.com.databindingthirthapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidworks.bsrakdg.com.databindingthirthapp.databinding.ActivityMainBinding;
import androidworks.bsrakdg.com.databindingthirthapp.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("bsrakdg", "bsrakdg@gmail.com", "123456", "Basın express caddesi, Küçükçekmece İstanbul");

        activityMainBinding.setUser(user);

        UIEventListener listener = new UIEventListener(this);

        activityMainBinding.setListener(listener);

    }
}
