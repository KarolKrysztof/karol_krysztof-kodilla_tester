package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {

        Dog dog = new Dog();

        AnimaProcessor processor = new AnimaProcessor();

        processor.process(dog);
    }
}
