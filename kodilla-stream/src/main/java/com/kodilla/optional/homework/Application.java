package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith ", new Teacher("Anna Smiths")));
        students.add(new Student("Anna Kowalsky"));
        students.add(new Student("Henry Windsor ", new Teacher("Bob Marley")));
        students.add(new Student("Helen Noah"));
        students.add(new Student("Gary White ", new Teacher("Paul Newman")));

        for (Student student : students) {

            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " +
                    Optional.ofNullable(student.getTeacher()).map(Teacher::getName).orElse("undefined"));
        }

    }

}
