package com.kodilla.inheritance.homework;

public class LinuxSystem extends OperatingSystem {

    public void turnOn() {
        System.out.println("System Linux was turned on in 50 seconds");
    }

    public LinuxSystem(int year) {
        super(year);
    }

}

