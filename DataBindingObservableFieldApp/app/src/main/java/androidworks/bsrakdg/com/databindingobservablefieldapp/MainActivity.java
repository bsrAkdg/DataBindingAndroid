package androidworks.bsrakdg.com.databindingobservablefieldapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidworks.bsrakdg.com.databindingobservablefieldapp.databinding.ActivityMainBinding;
import androidworks.bsrakdg.com.databindingobservablefieldapp.model.ClickHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setHandler(new ClickHandler(this));

    }
}
