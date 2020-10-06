package com.kodilla.inheritance.homework;

public class SystemCheck {

    public static void main(String[] args) {

        LinuxSystem linux = new LinuxSystem(1991);
        linux.turnOn();
        linux.turnOff();
        linux.displayYearOfPublishment();

        SystemMacOs macOS = new SystemMacOs(2001);
        macOS.turnOn();
        macOS.turnOff();
        macOS.displayYearOfPublishment();
    }

}
