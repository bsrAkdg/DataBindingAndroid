package androidworks.bsrakdg.com.profilescreenapp.utils;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidworks.bsrakdg.com.profilescreenapp.models.User;

public class ProfileClickHandlers {

    public void onProfileFabClicked(View view, User user) {
        user.setName("Büşra Serdaroğlu");
        user.setProfileImage("https://api.androidhive.info/images/nature/david1.jpg");
        user.numberOfPosts.set(5500L);
        user.numberOfFollowers.set(5050890L);
        user.numberOfFollowing.set(180L);
    }

    public boolean onProfileImageLongPressed(View view) {
        Toast.makeText(view.getContext(), "Profile image long pressed!", Toast.LENGTH_LONG).show();
        return false;
    }

    public void onFollowersClicked(View view) {
        Toast.makeText(view.getContext(), "Followers is clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onFollowingClicked(View view) {
        Toast.makeText(view.getContext(), "Following is clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onPostsClicked(View view) {
        Toast.makeText(view.getContext(), "Posts is clicked!", Toast.LENGTH_SHORT).show();
    }

}
