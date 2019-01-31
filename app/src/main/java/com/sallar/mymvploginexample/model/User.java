package com.sallar.mymvploginexample.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {

    String email , password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidData() {
        return !TextUtils.isEmpty(getEmail()) &&
                getEmail().equals("sallar@live.com") &&
                getPassword().length() > 6;
    }
}
