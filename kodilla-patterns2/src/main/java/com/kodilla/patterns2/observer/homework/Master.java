package com.kodilla.patterns2.observer.homework;

public class Master implements Observer {
    private final String masterName;
    private int updateCount;

    public Master(String masterName) {
        this.masterName = masterName;
    }
    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(masterName + ": New tasks in the queue of " + studentTasks.getStudentName() + "\n" +
                " (total: " + studentTasks.getStudentTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMasterName() {
        return masterName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
