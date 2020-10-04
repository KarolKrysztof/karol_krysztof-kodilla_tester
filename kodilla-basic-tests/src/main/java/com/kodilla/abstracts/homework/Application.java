package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(2, 4, 6, 5);
        Square square = new Square(6);
        Circle circle = new Circle(5);

        System.out.println("Pole trójkąta wynosi:" + triangle.calculateArea());
        System.out.println("Obwód trójkąta wynosi:" + triangle.calculatePerimeter());
        System.out.println("Pole kwadratu wynosi:" + square.calculateArea());
        System.out.println("Obwód kwadratu wynosi:" + square.calculatePerimeter());
        System.out.println("Pole koła wynosi:" + circle.calculateArea());
        System.out.println("Obwód koła wynosi:" + circle.calculatePerimeter());

    }
}
