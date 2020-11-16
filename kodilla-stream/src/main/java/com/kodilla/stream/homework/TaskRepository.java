package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("clean garage", LocalDate.of(2020, 11, 16), LocalDate.of(2020, 11, 21)));
        tasks.add(new Task("buy new TV", LocalDate.of(2020, 11,03), LocalDate.of(2021, 02, 27)));
        tasks.add(new Task("do shopping", LocalDate.of(2020, 11,18), LocalDate.of(2020, 11, 20)));
        tasks.add(new Task("call John", LocalDate.of(2020, 11, 13), LocalDate.of(2020, 11, 15)));
        return tasks;
    }
}
