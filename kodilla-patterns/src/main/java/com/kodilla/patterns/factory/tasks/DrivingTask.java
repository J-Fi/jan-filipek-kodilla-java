package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        String task = "Drive to " + where + " using a " + using;
        if (using.equals("car")) {
            System.out.println("The task " + getTaskName() + " [" + task + "] is done successfully");
            return "Success!";
        } else {
            return "Not yet";
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return (executeTask().equals("Success!"));
    }
}
