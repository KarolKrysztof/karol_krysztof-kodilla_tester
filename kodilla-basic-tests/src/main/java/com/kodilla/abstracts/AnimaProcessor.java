package com.kodilla.abstracts;

public class AnimaProcessor {

    public void process(Animal animal) {

        System.out.println("Animal has"  +  animal.getNumberOfLegs()  +  "legs");

        animal.giveVoice();
    }
}
