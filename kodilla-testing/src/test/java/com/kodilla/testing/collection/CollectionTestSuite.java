package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumberExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        //When
        List<Integer> onlyEvenNumbers = exterminator.exterminate(listOfNumbers);
        System.out.println("Testing: " + onlyEvenNumbers);
        //Then
        Assert.assertTrue(onlyEvenNumbers.containsAll(Arrays.asList(2,4,6,8,10,12)));
        Assert.assertFalse(onlyEvenNumbers.containsAll(Arrays.asList(1,3,5,7,9,11,13)));
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> listOfNumbers1 = new ArrayList<>();
        //When
        List<Integer> onlyEvenNumbers1 = exterminator.exterminate(listOfNumbers1);
        System.out.println("Testing: " + onlyEvenNumbers1);
        //Then
        Assert.assertTrue(onlyEvenNumbers1.containsAll(Arrays.asList()));
    }
}
