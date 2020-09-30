package com.kodilla.inheritance.homework;

public class SystemMacOs extends OperatingSystem {

    public void turnOff() {
        System.out.println("System macOS was turned off in 24 seconds");
    }

    public SystemMacOs(int year) {
        super(year);
    }
}
