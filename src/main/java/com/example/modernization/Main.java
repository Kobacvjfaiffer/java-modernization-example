package com.example.modernization;

public class Main {

    public static void main(String[] args) {

        UserServiceLegacy legacyService = new UserServiceLegacy();
        UserServiceModern modernService = new UserServiceModern();

        System.out.println("Legacy active users:");
        legacyService.getActiveUsers()
                .forEach(user -> System.out.println(user.getEmail()));

        System.out.println("\nModern active users:");
        modernService.getActiveUsers()
                .forEach(user -> System.out.println(user.getEmail()));
    }
}

