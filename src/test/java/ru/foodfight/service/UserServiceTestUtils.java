package ru.foodfight.service;

import ru.foodfight.model.User;
import ru.foodfight.model.Vote;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserServiceTestUtils {
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final Integer START_SEQ = 10000;

    public static User user1 = new User(START_SEQ, 0, "John");
    public static User user2 = new User(START_SEQ + 1, 0, "Sara");

    public static Vote vote1 = new Vote(START_SEQ + 4, user1, null, LocalDateTime.parse("2020-03-22 10:00:00", formatter));
    public static Vote vote2 = new Vote(START_SEQ + 5, user2, null, LocalDateTime.parse("2020-03-22 10:30:00", formatter));

    public static boolean compare(User user1, User user2) {
        try {
            return user1.getId().equals(user2.getId()) &&
                    user1.getName().equals(user2.getName()) &&
                    user1.getIsAdmin().equals(user2.getIsAdmin());
        } catch (NullPointerException e) {
            return false;
        }
    }

    //compares user_id, not user
    public static boolean compare(Vote vote1, Vote vote2) {
        try {
            return vote1.getId().equals(vote2.getId()) &&
                    vote1.getVoteTime().equals(vote2.getVoteTime());
        } catch (NullPointerException e) {
            return false;
        }
    }
}
