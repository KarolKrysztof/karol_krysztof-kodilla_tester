package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Lexus;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("------------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    public static String getCarBrand(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Lexus)
            return "Lexus";
        else if (car instanceof Kia)
            return "Kia";
        else
            return "Unknown car brand";
    }
}
