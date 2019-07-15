package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task taskFactory(final String taskType) {
        switch(taskType) {
            case SHOPPING:
                return new ShoppingTask("Buy food", "meat cans", 3);
            case PAINTING:
                return new PaintingTask("Paint house", "red", "walls");
            case DRIVING:
                return new DrivingTask("Drive for weekend", "Mazury", "car");
            default:
                return null;
        }
    }
}
