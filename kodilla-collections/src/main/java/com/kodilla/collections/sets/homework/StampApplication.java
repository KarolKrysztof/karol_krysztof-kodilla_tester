package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("National Stadium", 2, 3));
        stamps.add(new Stamp("Camp Nou Stadium", 4, 2));
        stamps.add(new Stamp("Alianz Arena", 5, 2));
        stamps.add(new Stamp("Camp Nou Stadium", 4, 2));
        stamps.add(new Stamp("Camp Nou Stadium", 4, 2));
        stamps.add(new Stamp("Ford Mustang", 10, 4.5));
        stamps.add(new Stamp("Ford Mustang", 10, 4.5));

        System.out.println(stamps.size());
        for(Stamp stamp : stamps)
            System.out.println(stamp.getStampName() + " " + stamp.getStampSize() + " cm2 " + stamp.isStamped());

    }

}
