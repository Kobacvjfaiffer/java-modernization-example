package com.example.modernization;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserServiceModern {

    public List<User> getActiveUsers() {
        return Stream.of(
                        new User("ana@empresa.com", true),
                        new User("juan@empresa.com", false),
                        new User("maria@empresa.com", true)
                )
                .filter(User::isActive)
                .collect(Collectors.toList());
    }
}

