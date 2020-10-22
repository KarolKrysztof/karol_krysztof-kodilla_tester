package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car ford = new Ford(40);
        doRace(ford);

        Car lexus = new Lexus(80);
        doRace(lexus);

        Car kia = new Kia(60);
        doRace(kia);

        }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());

    }
}
