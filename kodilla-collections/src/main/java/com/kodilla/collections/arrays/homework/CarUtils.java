package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Lexus;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println(getCarBrand(car) + " " + car.getSpeed() + "km/h");

    }

    public static String getCarBrand(Car car) {
        return car.getName();
    }
}
