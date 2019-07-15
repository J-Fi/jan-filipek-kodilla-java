package com.kodilla.patterns.factory.tasks;

import java.util.Map;

public class TasksStatusLoader {
    private Map<String,Boolean> tasksStatusMap;

    public void loadTaskStatus(Task task) {
        tasksStatusMap = TasksStatus.getInstance().getTaskStatus();
        tasksStatusMap.put(task.getTaskName(), task.isTaskExecuted());
    }

    public Map<String, Boolean> getTasksStatusMap() {
        return tasksStatusMap;
    }
}
