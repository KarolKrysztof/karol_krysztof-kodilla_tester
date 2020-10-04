package com.kodilla.abstracts.homework;

public class Manager extends Job {

    public Manager(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void printResponsibilities() {
        System.out.println("Manager zarządza ludźmi");
    }
}
