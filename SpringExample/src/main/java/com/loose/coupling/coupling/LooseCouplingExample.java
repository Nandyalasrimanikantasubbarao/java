package com.loose.coupling.coupling;

import com.tight.coupling.UserManager;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider=new UserDatabaseProvider();
        UserManager userManager=new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
