package com.kodilla.testing.shape.tdd;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private ShapeCollector sc;

    private Shape addSampleTriangle() {
        Shape shape = new Triangle(4,6);
        return shape;
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Before
    public void setup() {
        sc = new ShapeCollector();
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape s = addSampleTriangle();
        //When
        sc.addFigure(s) ;
        //Then
        Assert.assertEquals(1, sc.getAllShapes().size());
   }
   @Test
    public void testRemoveFigure() {
        //Given
       Shape s = addSampleTriangle();
       sc.addFigure(s);
        //When
       boolean result = sc.removeFigure(s);
       //Then
       Assert.assertTrue(result);
       Assert.assertEquals(0, sc.getAllShapes().size());
   }
   @Test
    public void testGetFigure() {
        //Given
       Shape s = addSampleTriangle();
       sc.addFigure(s);
       //When
       Shape shape = sc.getFigure(0);
       //Then
       Assert.assertEquals(s, shape);
   }
   @Test
    public void testRemoveFigureNotExisting() {
        //Given
       Shape s = addSampleTriangle();
       //When
       boolean result = sc.removeFigure(s);
       //Then
       Assert.assertFalse(result);
  }
}
