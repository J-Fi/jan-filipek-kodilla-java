package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"987728939", "John", "Smith"},
            {"987728938", "Mary", "Pic"},
            {"987728935", "Leo", "Firff"},
            {"987728934", "Mark", "Talks"},
            {"987728931", "Steve", "Pepper"},
    };
    private double[] salaries = {
            3400.00,
            4230.99,
            2123.34,
            6678.9,
            2304.45
    };
    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers() {
        return workers;
    }
    public double[] getSalaries() {
        return salaries;
    }
}
