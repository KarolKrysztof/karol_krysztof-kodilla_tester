package com.kodilla.collections.interfaces.homework;

public class Kia implements  Car {

    private int speed;
    private static final int INCREASE_VALUE = 40;
    private static final int DECREASE_VALUE = 20;

    @Override
    public String getName() {
        return "Kia";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + INCREASE_VALUE;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - DECREASE_VALUE;
        if (speed < 0)
            speed = 0;

    }

}
