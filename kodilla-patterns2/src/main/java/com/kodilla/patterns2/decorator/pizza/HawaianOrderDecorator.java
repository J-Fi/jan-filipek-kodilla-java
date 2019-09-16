package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaianOrderDecorator extends AbstractPizzaOrderDecorator{
    public HawaianOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("22"));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " mediterranean seasonings, pineapple and ham";
    }
}
