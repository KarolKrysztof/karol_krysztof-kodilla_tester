package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private String job;

    public Person (String firstName, int age, String job) {

        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Doctor doctor = new Doctor(5000, null);
        doctor.printResponsibilities();
        Manager manager = new Manager(3000, null);
        manager.printResponsibilities();
        PoliceMan policeMan = new PoliceMan(4000, null);
        policeMan.printResponsibilities();

    }

}