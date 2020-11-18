package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Teacher teacher;

    List<Teacher> teachers = new ArrayList<>();


    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", teachers=" + teachers +
                '}';
    }
}
