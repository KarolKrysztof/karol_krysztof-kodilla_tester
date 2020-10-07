package com.kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayResponsibilities() {
        System.out.println("Lekarz leczy ludzi");

    }
}
