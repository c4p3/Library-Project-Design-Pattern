package com.tseort.UserFactory;

public class UserFactory {

    public IUser createUser(String username, String password, boolean isPremium) {
        if (isPremium) {
            return new UserPremium();
        } else {
            return new UserNormal();
        }
    }
}
