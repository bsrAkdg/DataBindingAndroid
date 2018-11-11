package androidworks.bsrakdg.com.databindingobservableapp.model;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickHandler {

    Context context;

    public ClickHandler(Context context) {
        this.context = context;
    }

    public void showNewUser(View view, User user) {
        user.setName("bsrakdg");
        user.setEmail("bsrakdg@xxx.com");
        Toast.makeText(context, "New user saved !", Toast.LENGTH_LONG).show();
    }
}
