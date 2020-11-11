package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    private List<Integer> studentCountInClasses;
    private String name;

    public School(String name, List<Integer> studentCountInClasses) {
        this.name = name;
        this.studentCountInClasses = studentCountInClasses;
    }

    public String getName() {
        return name;
    }

    public int numberOfStudents() {
        int sum = 0;
        for (int i = 0; i < studentCountInClasses.size(); i++) {
            sum = sum + studentCountInClasses.get(i);

        }

        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentCountInClasses=" + studentCountInClasses +
                ", name='" + name + '\'' +
                '}';
    }

}
