package com.kodilla.good.patterns.food2door.order;

public class OrderHandlingService {
    private Order order;

    public OrderHandlingService(Order order) {
        this.order = order;
    }

    public OrderDto orderProcess() {
        boolean isSuccess = order.getProducer().process(order);
        if(isSuccess == true) {
            return new OrderDto(order.getProducer(), order.getClient(), true);
        } else {
            return new OrderDto(order.getProducer(), order.getClient(), false);
        }
    }
}
