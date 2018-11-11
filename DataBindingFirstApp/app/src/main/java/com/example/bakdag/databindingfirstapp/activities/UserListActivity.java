package com.example.bakdag.databindingfirstapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bakdag.databindingfirstapp.R;
import com.example.bakdag.databindingfirstapp.adapters.UserAdapter;
import com.example.bakdag.databindingfirstapp.customModel.User;

import java.util.ArrayList;
import java.util.List;


public class UserListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<User> userList = new ArrayList<User>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_list_activity);

        userList.add(new User("bsrakdg","Büşra","Akdağ", 25, "famale", "1111111"));
        userList.add(new User("oserdaroglu","Okan","Serdaroğlu", 30, "male", "2222222"));
        userList.add(new User("aliveli","Ali","Veli", 18, "male", "3333333"));
        userList.add(new User("ayşefatma","Ayşe","Fatma", 21, "fammale", "4444444"));
        userList.add(new User("kbr.ylds","Kübra","Yıldız", 26, "famale", "5555555"));

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        UserAdapter userAdapter = new UserAdapter(UserListActivity.this, userList);
        recyclerView.setAdapter(userAdapter);
    }
}
