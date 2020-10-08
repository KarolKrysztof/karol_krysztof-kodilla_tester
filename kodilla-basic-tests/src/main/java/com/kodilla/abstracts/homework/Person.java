package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person (String firstName, int age) {

        this.firstName = firstName;
        this.age = age;
    }

    public void setJob (Job job) {
        this.job = job;

    }

    public void displayResponsibilities() {
        if (job == null) {
            System.out.println("This employee has no responsibilities yet");
            return;
        }
        System.out.println(firstName + "'s responsibilities are" + " " + job.getResponsibilities());

    }

}

