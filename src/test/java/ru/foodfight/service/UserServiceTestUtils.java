package ru.foodfight.service;

import ru.foodfight.model.User;

public class UserServiceTestUtils {
    public static final Integer START_SEQ = 10000;
    public static User user1 = new User(START_SEQ, 0,"abc");

    public static boolean compare(User user1, User user2) {
        try {
            return user1.getId().equals(user2.getId()) &&
                    user1.getName().equals(user2.getName()) &&
                    user1.getIsAdmin().equals(user2.getIsAdmin());
        } catch (NullPointerException e) {
            return false;
        }
    }
}
