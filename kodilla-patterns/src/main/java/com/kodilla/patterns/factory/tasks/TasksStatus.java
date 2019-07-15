package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public final class TasksStatus {
    private Map<String, Boolean> taskStatus;
    private static TasksStatus tasksStatusInstance = null;

    private TasksStatus() {
        this.taskStatus = new HashMap<>();
    }

    public static TasksStatus getInstance() {
        if (tasksStatusInstance == null){
            tasksStatusInstance = new TasksStatus();
        }
        return tasksStatusInstance;
    }

    public Map<String, Boolean> getTaskStatus() {
        return taskStatus;
    }
}
