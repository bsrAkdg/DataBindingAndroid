package com.example.bakdag.databindingfirstapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bakdag.databindingfirstapp.PhoneImgClickHandler;
import com.example.bakdag.databindingfirstapp.customModel.User;
import com.example.bakdag.databindingfirstapp.databinding.UserListItemBinding;

import java.util.List;


/**
 * Created by bakdag on 18.12.2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserItemVH> {

    List<User> userList;
    Context context;

    public UserAdapter(Context context , List<User> userList){
        this.context = context;
        this.userList = userList;
    }

    @Override
    public UserItemVH onCreateViewHolder(ViewGroup parent, int viewType) {
        UserListItemBinding userListItemBinding = UserListItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new UserItemVH(userListItemBinding);
    }

    @Override
    public void onBindViewHolder(UserItemVH holder, int position) {
        User user = userList.get(position);
        holder.bind(user);
        holder.getUserListItemBinding().setPhoneHandler(new PhoneImgClickHandler() {
            @Override
            public void callPhone(User user) {
                Toast.makeText(context, user.getPhone() + " calling ... ", Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserItemVH extends RecyclerView.ViewHolder{

        UserListItemBinding userListItemBinding;

        public UserItemVH(UserListItemBinding userListItemBinding) {
            super(userListItemBinding.getRoot());
            this.userListItemBinding = userListItemBinding;
        }

        public void bind(User user){
            this.userListItemBinding.setUser(user);
        }

        public UserListItemBinding getUserListItemBinding(){
            return this.userListItemBinding;
        }
    }
}
