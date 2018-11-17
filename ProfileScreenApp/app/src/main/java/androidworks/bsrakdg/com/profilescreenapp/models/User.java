package androidworks.bsrakdg.com.profilescreenapp.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import androidworks.bsrakdg.com.profilescreenapp.BR;

public class User extends BaseObservable {
    /**
    - BR class created data binding enable in build.gradle.

    - Bindable : The Bindable annotation should be applied to any getter accessor method of an Observable
    class. Bindable will generate a field in the BR class to identify the field that has changed.

    */
    private String name;
    private String email;
    private String profileImage;
    private String about;

    public ObservableField<Long> numberOfFollowers = new ObservableField<>();
    public ObservableField<Long> numberOfFollowing = new ObservableField<>();
    public ObservableField<Long> numberOfPosts = new ObservableField<>();

    public User() {
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Bindable
    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
        notifyPropertyChanged(BR.profileImage);
    }

    @Bindable
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
        notifyPropertyChanged(BR.about);
    }

    public ObservableField<Long> getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public ObservableField<Long> getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public ObservableField<Long> getNumberOfPosts() {
        return numberOfPosts;
    }

    @BindingAdapter("profileImage")
    public static void loadImage(ImageView imageView, String imageUrl){
        Glide.with(imageView.getContext())
                .load(imageUrl)
                .apply(RequestOptions.circleCropTransform())
                .into(imageView);
    }
}
