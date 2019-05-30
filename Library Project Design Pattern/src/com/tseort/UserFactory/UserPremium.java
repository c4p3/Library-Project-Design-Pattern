package com.tseort.UserFactory;

import com.tseort.BookFactory.IBook;

import java.util.ArrayList;
import java.util.List;

public class UserPremium implements IUser {

    String username;
    String password;

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return "Premium User";
    }

}
