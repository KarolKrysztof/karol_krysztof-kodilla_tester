package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private static final int INCREASE_VALUE = 30;
    private static final int DECREASE_VALUE = 50;

    public Ford(int speed) {
        this.speed = speed;
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
        if(speed < 0) {
          speed = 0;
        }
        else if(speed - DECREASE_VALUE < 0)
            speed = 0;
        else
            speed = speed - DECREASE_VALUE;
    }

}
