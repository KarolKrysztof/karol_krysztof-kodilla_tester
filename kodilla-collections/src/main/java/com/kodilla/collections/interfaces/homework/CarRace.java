package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car ford = new Ford("Ford Mustang", 0);
        doRace(ford);

        Car lexus = new Lexus("Lexus NX 300",0);
        doRace(lexus);

        Car kia = new Kia("Kia Sportage", 0);
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
