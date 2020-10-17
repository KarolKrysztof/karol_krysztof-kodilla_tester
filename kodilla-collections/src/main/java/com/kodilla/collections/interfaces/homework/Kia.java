package com.kodilla.collections.interfaces.homework;

public class Kia implements  Car {

    int speed;
    private static final int increaseValue = 40;
    private static final int decreaseValue = 20;

    public Kia(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void getIncreaseSpeed() {
        speed = speed + increaseValue;

    }

    @Override
    public void getDecreaseSpeed() {
        speed = speed - decreaseValue;

    }

}
