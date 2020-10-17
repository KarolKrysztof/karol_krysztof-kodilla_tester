package com.kodilla.collections.interfaces.homework;

public class Lexus implements Car {

    int speed;
    private static final int increaseValue = 50;
    private static final int decreaseValue = 30;

    public Lexus(int speed) {
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
