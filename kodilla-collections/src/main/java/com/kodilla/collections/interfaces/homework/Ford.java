package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private static final int INCREASE_VALUE = 50;
    private static final int DECREASE_VALUE = 60;

    @Override
    public String getName() {
        return "Ford";
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
