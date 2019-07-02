package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.order.Order;

public interface RepositoryMethod {
    public void record (Order order);
}
