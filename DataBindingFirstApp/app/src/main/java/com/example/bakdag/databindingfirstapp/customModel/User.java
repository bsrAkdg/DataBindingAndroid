package com.example.bakdag.databindingfirstapp.customModel;

import java.io.Serializable;

/**
 * Created by bakdag on 18.12.2017.
 */

public class User implements Serializable {
    public String username;
    public String firstname;
    public String lastname;
    public String phone;
    public Integer age;
    public String gender;

    public User(String username, String firstname, String lastname, Integer age, String gender, String phone) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
