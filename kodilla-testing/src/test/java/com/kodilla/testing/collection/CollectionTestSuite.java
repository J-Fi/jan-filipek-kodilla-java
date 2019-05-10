package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        OddNumbersExterminator one = new OddNumbersExterminator();
        //When
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) { //czy w parametrach pętli użycie typu Integer dla zmiennej i zamiast typu prostego int typu Integer spowolni aplikacje?
            Integer j = i;
            list.add(j);
        }
        ArrayList<Integer> onlyEvenNumbers = one.exterminate(list);
        double isEven = 0;
        for(int i = 0; i < onlyEvenNumbers.size(); i++) {
             isEven += onlyEvenNumbers.get(i) % 2;
        }
        System.out.println("Testing: " + onlyEvenNumbers);
        //Then
        Assert.assertTrue(onlyEvenNumbers instanceof ArrayList && isEven == 0);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator two = new OddNumbersExterminator();
        //When
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> onlyEvenNumbers1 = two.exterminate(list1);
        System.out.println("Testing: " + onlyEvenNumbers1);
        //Then
        Assert.assertTrue(onlyEvenNumbers1 instanceof ArrayList && onlyEvenNumbers1.size() == 0);
    }
}
