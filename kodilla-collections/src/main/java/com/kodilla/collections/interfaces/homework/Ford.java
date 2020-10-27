package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private final String name;
    private static final int INCREASE_VALUE = 50;
    private static final int DECREASE_VALUE = 60;

    public Ford(String name, int speed) {
        this.speed = 0;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
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
