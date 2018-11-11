package androidworks.bsrakdg.com.databindingobservableapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidworks.bsrakdg.com.databindingobservableapp.databinding.ActivityMainBinding;
import androidworks.bsrakdg.com.databindingobservableapp.model.ClickHandler;
import androidworks.bsrakdg.com.databindingobservableapp.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setUser(new User("Ayşe", "ayse@xxx.com"));
        binding.setHandler(new ClickHandler(this));

    }
}
