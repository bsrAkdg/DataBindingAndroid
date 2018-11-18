package androidworks.bsrakdg.com.profilescreenapp.views;

import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.widget.Toast;

import java.util.ArrayList;

import androidworks.bsrakdg.com.profilescreenapp.R;
import androidworks.bsrakdg.com.profilescreenapp.databinding.ActivityMainBinding;
import androidworks.bsrakdg.com.profilescreenapp.models.Post;
import androidworks.bsrakdg.com.profilescreenapp.models.User;
import androidworks.bsrakdg.com.profilescreenapp.utils.GridSpacingItemDecoration;
import androidworks.bsrakdg.com.profilescreenapp.utils.ProfileClickHandlers;

//https://www.androidhive.info/android-databinding-in-recyclerview-profile-screen/
public class MainActivity extends AppCompatActivity implements PostsAdapter.PostAdapterListener{

    private ActivityMainBinding activityMainBinding;
    private User user;
    private RecyclerView recyclerPosts;
    private PostsAdapter postsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Toolbar toolbar = activityMainBinding.toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.toolbar_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        renderProfile();

        initRecyclerView();
    }

    private void renderProfile() {
        user = new User();
        user.setName("Okan Serdaroğlu");
        user.setEmail("okan@serdaroglu.com");
        user.setProfileImage("https://api.androidhive.info/images/nature/david.jpg");
        user.setAbout("Realist :)");

        // ObservableField doesn't have setter method, instead will
        // be called using set() method
        user.numberOfPosts.set(3400L);
        user.numberOfFollowers.set(3050890L);
        user.numberOfFollowing.set(150L);

        activityMainBinding.setUser(user);
        activityMainBinding.content.setHandlers(new ProfileClickHandlers());
    }

    private void initRecyclerView() {
        recyclerPosts = activityMainBinding.content.recycler;
        recyclerPosts.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerPosts.addItemDecoration(new GridSpacingItemDecoration(3, dpToPx(4), true));
        recyclerPosts.setItemAnimator(new DefaultItemAnimator());
        recyclerPosts.setNestedScrollingEnabled(false);
        postsAdapter = new PostsAdapter(getPosts(), this);
        recyclerPosts.setAdapter(postsAdapter);
    }

    private ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Post post = new Post();
            post.setImageUrl("https://api.androidhive.info/images/nature/" + i + ".jpg");

            posts.add(post);
        }

        return posts;
    }

    @Override
    public void onPostClicked(Post post) {
        Toast.makeText(this, "Clicked Post!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
