package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("System was turned on in 20 seconds");
    }

    public void turnOff() {
        System.out.println("System was turned off in 36 seconds");
    }

    public int getYear() {
        return year;
    }

    public void displayYearOfPublishment() {
        System.out.println("Rok wydania systemu:" + year);
    }

}
