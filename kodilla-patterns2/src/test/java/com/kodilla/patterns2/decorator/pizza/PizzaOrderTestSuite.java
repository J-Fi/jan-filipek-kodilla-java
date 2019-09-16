package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testHawaianWithExtraSauceAndCheese() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaianOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals(new BigDecimal("44"),cost);
        assertEquals("Pizza dough and tomato sauce with cheese mediterranean seasonings, " +
                "pineapple and ham cheddar cheese, gouda cheese", description);
    }
}
