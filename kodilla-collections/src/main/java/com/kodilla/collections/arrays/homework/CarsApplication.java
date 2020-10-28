package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;

public class CarsApplication {

    private static final Random GENERATOR = new Random();

    public static Car drawCar() {
        Car car = randomCar();
        int repeats = GENERATOR.nextInt(3) + 1;
        for (int i = 0; i < repeats; i++) {
            car.increaseSpeed();
        }

        return car;

    }

    private static Car randomCar() {
        int random = GENERATOR.nextInt(3);
        if (random == 0) return new Ford();
        if (random == 1) return new Lexus();
        return new Kia();
    }

    public static void main(String[] args) {

        Car[] cars = new Car[GENERATOR.nextInt(15) + 1];
        for(int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for(Car car : cars)
            CarUtils.describeCar(car);

    }

}
