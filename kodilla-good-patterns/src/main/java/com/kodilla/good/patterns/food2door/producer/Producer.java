package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.order.Order;

public interface Producer {
    public boolean process(Order order);
}
