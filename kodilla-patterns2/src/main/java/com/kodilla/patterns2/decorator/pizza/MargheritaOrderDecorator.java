package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MargheritaOrderDecorator extends AbstractPizzaOrderDecorator {
    public MargheritaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("17"));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " mediterranean seasonings";
    }
}
