package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStatus {
    public static void main(String[] args) {
        double avg1 = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPosts)
                .mapToInt(u -> u)
                .average()
                .orElse(0);     // nie używać getAsDouble
        System.out.println(avg1);

        double avg2 = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPosts)
                .mapToInt(u -> u)
                .average()
                .orElse(0);    // nie używać getAsDouble
        System.out.println(avg2);

    }
}
