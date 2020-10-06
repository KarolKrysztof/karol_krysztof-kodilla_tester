package com.kodilla.inheritance.homework;

public class SystemMacOs extends OperatingSystem {

    public SystemMacOs(int year) {

        super(year);
    }

    public void turnOff() {
        System.out.println("System macOS was turned off in 24 seconds");
    }

    public void turnOn() {
        System.out.println("System macOs was turned on in 10 seconds");
    }
}
