package androidworks.bsrakdg.com.profilescreenapp.views;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidworks.bsrakdg.com.profilescreenapp.R;
import androidworks.bsrakdg.com.profilescreenapp.databinding.PostRowItemBinding;
import androidworks.bsrakdg.com.profilescreenapp.models.Post;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private List<Post> postList;
    private LayoutInflater layoutInflater;
    private PostAdapterListener listener;

    public PostsAdapter(List<Post> postList, PostAdapterListener listener) {
        this.postList = postList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }

        PostRowItemBinding postRowItemBinding = DataBindingUtil.inflate(layoutInflater,
                R.layout.post_row_item, parent, false);

        return new PostViewHolder(postRowItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, final int position) {
        holder.postRowItemBinding.setPost(postList.get(position));
        holder.postRowItemBinding.imgPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null){
                    listener.onPostClicked(postList.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        private final PostRowItemBinding postRowItemBinding;

        public PostViewHolder(PostRowItemBinding postRowItemBinding) {
            super(postRowItemBinding.getRoot());
            this.postRowItemBinding = postRowItemBinding;
        }
    }

    public interface PostAdapterListener {
        void onPostClicked(Post post);
    }
}
