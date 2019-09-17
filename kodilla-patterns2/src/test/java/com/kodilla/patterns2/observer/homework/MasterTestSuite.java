package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MasterTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Master springBooty = new Master("Spring Booty");
        Master javaCoder = new Master("Java Coder");
        StudentTasks janFili = new StudentTasks("Jan Fili");
        StudentTasks paulObject = new StudentTasks("Paul Object");
        StudentTasks peterHashcode = new StudentTasks("Peter Hashcode");

        janFili.registerObserver(springBooty);
        paulObject.registerObserver(javaCoder);
        peterHashcode.registerObserver(springBooty);

        //When
        janFili.addTask("Zadanie 1");
        paulObject.addTask("Zadanie 2");
        peterHashcode.addTask("Zadanie 3");
        janFili.addTask("Zadanie 4");

        //Then
        assertEquals(3,springBooty.getUpdateCount());
        assertEquals(1,javaCoder.getUpdateCount());
    }
}
