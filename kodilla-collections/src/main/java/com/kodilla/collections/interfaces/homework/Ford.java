package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    int speed;
    private static final int increaseValue = 30;
    private static final int decreaseValue = 10;

    public Ford(int speed) {
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
