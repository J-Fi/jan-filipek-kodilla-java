package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import com.kodilla.patterns.factory.tasks.TasksStatusLoader;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    private TasksStatusLoader tsl = new TasksStatusLoader();

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.taskFactory(TaskFactory.PAINTING);
        tsl.loadTaskStatus(painting);

        //Then
        Assert.assertEquals("Success!", painting.executeTask());
        Assert.assertEquals("Paint house", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals(1, tsl.getTasksStatusMap().size());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.taskFactory(TaskFactory.DRIVING);
        tsl.loadTaskStatus(driving);

        //Then
        Assert.assertEquals("Success!", driving.executeTask());
        Assert.assertEquals("Drive for weekend", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals(2, tsl.getTasksStatusMap().size());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.taskFactory(TaskFactory.SHOPPING);
        tsl.loadTaskStatus(shopping);

        //Then
        Assert.assertEquals("Success!", shopping.executeTask());
        Assert.assertEquals("Buy food", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals(3, tsl.getTasksStatusMap().size());
    }
}
