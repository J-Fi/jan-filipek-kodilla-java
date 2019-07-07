package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(1.2,2.1);
        double resultSub = calculator.sub(2.2,1.1);
        double resultMul = calculator.mul(2,2);
        double resultDiv = calculator.div(6,2);

        //Then
        assertEquals(3.3, resultAdd, 0.01);
        assertEquals(1.1, resultSub, 0.01);
        assertEquals(4, resultMul, 0.01);
        assertEquals(3, resultDiv, 0.01);
    }
}
