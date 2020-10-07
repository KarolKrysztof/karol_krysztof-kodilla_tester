package com.kodilla.inheritance.homework;

public class LinuxSystem extends OperatingSystem {

    public LinuxSystem(int year) {

        super(year);
    }

    public void turnOn() {

        System.out.println("System Linux was turned on in 50 seconds");
    }

    public void turnOff() {
        System.out.println("System Linux was turned off in 14 seconds");
    }
}
