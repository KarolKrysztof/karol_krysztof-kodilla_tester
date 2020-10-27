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
        Kia kia = new Kia("Sportage", 60);
        cars.add(kia);
        cars.add(new Ford("KA", 40));
        cars.add(new Lexus("NX 300", 90));

        cars.remove(1);
        cars.remove(kia);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}
