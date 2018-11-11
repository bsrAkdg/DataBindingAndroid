package androidworks.bsrakdg.com.databindingbindingadapterapp;

import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidworks.bsrakdg.com.databindingbindingadapterapp.databinding.ActivityMainBinding;
import androidworks.bsrakdg.com.databindingbindingadapterapp.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setUser(new User("Winnie the Pooh", ContextCompat.getDrawable(this,R.drawable.winnie)));
    }
}
