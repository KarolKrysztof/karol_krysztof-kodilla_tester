package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Lexus;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Kia kia = new Kia();
        cars.add(kia);
        cars.add(new Ford());
        cars.add(new Lexus());

        printCars(cars);

        cars.remove(1);
        cars.remove(kia);

        System.out.println(cars.size());
        printCars(cars);

    }

    private static void printCars(List<Car> cars) {
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
