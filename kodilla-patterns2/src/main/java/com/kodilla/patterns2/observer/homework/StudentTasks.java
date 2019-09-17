package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements Observable {
    private final List<String> studentTasks;
    private final List<Observer> masters;
    private final String studentName;

    public StudentTasks(String studentName) {
        studentTasks = new ArrayList<>();
        masters = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        studentTasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        masters.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : masters) {
            observer.update(this);
        }
    }

    public List<String> getStudentTasks() {
        return studentTasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
