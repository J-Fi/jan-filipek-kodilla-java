package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        String task = "Buy " + whatToBuy + " in amount of " + quantity;
        if (quantity != 0) {
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
