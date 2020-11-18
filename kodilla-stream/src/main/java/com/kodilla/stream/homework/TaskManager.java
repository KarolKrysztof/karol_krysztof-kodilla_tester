package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    private static LocalDate currentDate = LocalDate.now();

    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(d -> !d.getDeadline().isBefore(currentDate))
                .map(TaskManager::getDeadLine)
                .collect(Collectors.toList());

    }

    public static LocalDate getDeadLine (Task task) {
        return task.getDeadline();
    }

}
