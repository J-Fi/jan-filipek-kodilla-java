package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        String task = "Paint a " + whatToPaint + " in " + color;
        if (color.equals("red")) {
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
