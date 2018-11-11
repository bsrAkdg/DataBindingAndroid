package androidworks.bsrakdg.com.databindingthirthapp;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidworks.bsrakdg.com.databindingthirthapp.model.User;

public class UIEventListener {
    Context context;
    public UIEventListener(Context context){
        this.context = context;
    }

    public void saveUserClick(View view){
        Toast.makeText(context, "İşlem başarılı", Toast.LENGTH_LONG).show();
    }

    public void welcomeUserClick(View view, User user){
        Toast.makeText(context, "Holgeldin " + user.getUsername(), Toast.LENGTH_LONG).show();

    }
}
