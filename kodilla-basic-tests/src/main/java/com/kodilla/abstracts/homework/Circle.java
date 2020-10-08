package com.kodilla.abstracts.homework;

public class Circle extends Shape {

 task-3.2

    double r;

    public Circle(double r) {
        this.r = r;
    }

 task-3.2
    @Override
    public double calculateArea() {
        return Math.PI * r * r;

    }

    @Override
    public double calculatePerimeter() {
task-3.2
        return 2 * Math.PI *r;

    }

}
