package androidworks.bsrakdg.com.databindingbindingadapterapp.model;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class User {

    public String username;

    public Drawable getProfileDrawable() {
        return profileDrawable;
    }

    public Drawable profileDrawable;

    public User(String username, Drawable profileDrawable){
        this.username = username;
        this.profileDrawable = profileDrawable;
    }

    public String getUsername() {
        return username;
    }

    @BindingAdapter("android:showImageFrom")
    public static void showImageFrom(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }
}
