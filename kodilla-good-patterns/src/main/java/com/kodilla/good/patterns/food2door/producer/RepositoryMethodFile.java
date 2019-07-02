package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.order.Order;

public class RepositoryMethodFile implements RepositoryMethod {
    public void record (Order order) {
        System.out.println("The order submitted by " + order.getClient().getName() + " was recorded in a file.");
    }
}