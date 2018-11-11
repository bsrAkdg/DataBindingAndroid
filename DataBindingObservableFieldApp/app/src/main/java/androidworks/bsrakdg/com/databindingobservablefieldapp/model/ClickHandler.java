package androidworks.bsrakdg.com.databindingobservablefieldapp.model;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickHandler {

    Context context;

    public ClickHandler(Context context) {
        this.context = context;
    }

    public void showNewUser(View view, User user) {
        //if you use ObservableField you should use set() and get() methods.
        user.name.set("bsrakdg");
        user.email.set("bsrakdg@xxx.com");
        user.isDeveloper.set(true);

        Toast.makeText(context, "New user saved!", Toast.LENGTH_LONG).show();

    }
}
