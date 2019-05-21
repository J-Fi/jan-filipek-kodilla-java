package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] intArray = {4,2,6,8};

        //When
        double avg = ArrayOperations.getAverage(intArray);

        //Then
        Assert.assertEquals(5.0, avg, 0.01);
    }
}
