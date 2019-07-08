package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean toDoListExists = context.containsBean("toDoList");
        boolean inProgressListExists = context.containsBean("inProgressList");
        boolean doneListExists = context.containsBean("doneList");
        //Then
        assertTrue(toDoListExists && inProgressListExists && doneListExists);
    }

    @Test
    public void testTaskAddForToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        //When
        toDoList.getTasks().add("Challenge1");
        //Then
        assertEquals(toDoList.getTasks().get(0), "Challenge1");
    }

    @Test
    public void testTaskAddForInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        //When
        inProgressList.getTasks().add("Challenge2");
        //Then
        assertEquals(inProgressList.getTasks().get(0), "Challenge2");
    }

    @Test
    public void testTaskAddForDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList doneList = (TaskList) context.getBean("doneList");
        //When
        doneList.getTasks().add("Challenge3");
        //Then
        assertEquals(doneList.getTasks().get(0), "Challenge3");
    }
}
