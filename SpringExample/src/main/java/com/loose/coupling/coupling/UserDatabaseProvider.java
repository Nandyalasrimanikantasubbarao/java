package com.loose.coupling.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User deatils";
    }
}
