package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;

public class CarsApplication {

    private static final Random GENERATOR = new Random();

    public static Car drawCar() {
        Car car = new Ford(30);
        int repeats = GENERATOR.nextInt(3) + 1;
        for (int i = 0; i < repeats; i++) {
            car.increaseSpeed();
        }

        return car;

    }

    public static void main(String[] args) {

        Car[] cars = new Car[GENERATOR.nextInt(15) + 1];
        for(int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for(Car car : cars)
            CarUtils.describeCar(car);

    }

    private void randomIncreaseSpeed(Car car) {
        int repeats = GENERATOR.nextInt(3) + 1;
        for (int i = 0; i < repeats; i++) {car.increaseSpeed();}
    }

}
