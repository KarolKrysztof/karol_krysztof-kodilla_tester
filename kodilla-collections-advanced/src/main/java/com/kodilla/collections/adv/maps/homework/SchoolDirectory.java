package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principals = new HashMap<>();
        Principal jefferson = new Principal("Jack", "Jones");
        Principal clue = new Principal("Zoe", "Claus");
        Principal mayer = new Principal("Stiven", "Mayers");

        School firstSchool = new School("First School", 15, 18, 14, 20, 16);
        School secondSchool = new School("Second School", 28, 30, 33, 32, 30);
        School thirdSchool = new School("Third School", 25, 24, 22, 24, 26);

        principals.put(jefferson, firstSchool);
        principals.put(clue, secondSchool);
        principals.put(mayer, thirdSchool);

        for (Map.Entry<Principal, School> principalSchoolEntry : principals.entrySet()) {
            System.out.println("Principal: " + principalSchoolEntry.getKey().getFirstName() + " " +
                    principalSchoolEntry.getKey().getLastName() + " --- Name of school: " + principalSchoolEntry.getValue().getName()
                    + " in LA --- Number of students: " + principalSchoolEntry.getValue().numberOfStudents());
        }
    }
}
