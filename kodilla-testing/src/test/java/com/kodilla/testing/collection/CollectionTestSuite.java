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
        List<Integer> onlyEvenList = new ArrayList<>();
        onlyEvenList.add(2);
        onlyEvenList.add(4);
        onlyEvenList.add(6);
        onlyEvenList.add(8);
        onlyEvenList.add(10);
        onlyEvenList.add(12);
        Assert.assertTrue(onlyEvenNumbers.containsAll(onlyEvenList));
        List<Integer> onlyOddList = new ArrayList<>();
        onlyOddList.add(1);
        onlyOddList.add(3);
        onlyOddList.add(5);
        onlyOddList.add(7);
        onlyOddList.add(9);
        onlyOddList.add(11);
        onlyOddList.add(13);
        Assert.assertFalse(onlyEvenNumbers.containsAll(onlyOddList));
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
        Assert.assertTrue(onlyEvenNumbers1 instanceof ArrayList && onlyEvenNumbers1.size() == 0);
    }
}
