package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public final double PI = 3.1415927;
    double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI *r;
    }

}
