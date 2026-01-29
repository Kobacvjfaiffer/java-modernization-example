package com.example.modernization;

import java.util.ArrayList;
import java.util.List;

public class UserServiceLegacy {

    public List<User> getActiveUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("ana@empresa.com", true));
        users.add(new User("juan@empresa.com", false));
        users.add(new User("maria@empresa.com", true));

        List<User> activeUsers = new ArrayList<>();
        for (User user : users) {
            if (user.isActive()) {
                activeUsers.add(user);
            }
        }

        return activeUsers;
    }
}

