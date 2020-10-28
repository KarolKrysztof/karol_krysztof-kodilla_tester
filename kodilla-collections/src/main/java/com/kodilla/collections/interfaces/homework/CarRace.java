package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car ford = new Ford();
        doRace(ford);

        Car lexus = new Lexus();
        doRace(lexus);

        Car kia = new Kia();
        doRace(kia);

        }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getName() + " " + car.getSpeed());

    }
}
