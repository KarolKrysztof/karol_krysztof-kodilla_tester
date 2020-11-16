package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadline = TaskRepository.getTask()
                .stream()
                .filter(d -> d.getDeadline().isAfter(currentDate))
                .map(TaskManager::getDeadLine)
                .collect(Collectors.toList());
        System.out.println(deadline);
    }

    public static LocalDate getDeadLine (Task task) {
        return task.getDeadline();
    }

    public static LocalDate currentDate = LocalDate.now();
}
