package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCollectorTestSuite {
    private static int testCounter = 0;
    private StatisticsCollector sc;
    Statistics statisticsMock;
    List<String> userNames;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Now preparing for testing number #" + testCounter);
        sc = new StatisticsCollector();
        statisticsMock = mock(Statistics.class);
        userNames = new ArrayList<String>();
    }

    @After
    public void afterEveryTest() {
        System.out.println("The test number #" + testCounter + " has been completed.");
    }

    @Test
    public void testCalculateAdvStatisticsNoZeros() {
        //Given
        userNames.add("Jan Filipek");
        userNames.add("Paweł Trollip");
        userNames.add("Maria Ząbek");
        userNames.add("Kachna Wielgachna");
        userNames.add("Biały Ząbek");
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);

        //When
        boolean result = sc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(5, sc.usersNumber);
        Assert.assertEquals(100, sc.postsNumber);
        Assert.assertEquals(200, sc.commentsNumber);
        Assert.assertEquals(20.0, sc.postsPerUser, 1.0);
        Assert.assertEquals(40.0, sc.commentsPerUser, 1.0);
        Assert.assertEquals(2.0, sc.commentsPerPost, 1.0);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroUsers() {
        //Given
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);

        //When
        boolean result = sc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroPosts() {
        //Given
        userNames.add("Jan Filipek");
        userNames.add("Paweł Trollip");
        userNames.add("Maria Ząbek");
        userNames.add("Kachna Wielgachna");
        userNames.add("Biały Ząbek");
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(200);

        //When
        boolean result = sc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroComments() {
        //Given
        userNames.add("Jan Filipek");
        userNames.add("Paweł Trollip");
        userNames.add("Maria Ząbek");
        userNames.add("Kachna Wielgachna");
        userNames.add("Biały Ząbek");
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        boolean result = sc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(5, sc.usersNumber);
        Assert.assertEquals(100, sc.postsNumber);
        Assert.assertEquals(0, sc.commentsNumber);
        Assert.assertEquals(20.0, sc.postsPerUser, 1.0);
        Assert.assertEquals(0.0, sc.commentsPerUser, 1.0);
        Assert.assertEquals(0.0, sc.commentsPerPost, 1.0);
    }



}
