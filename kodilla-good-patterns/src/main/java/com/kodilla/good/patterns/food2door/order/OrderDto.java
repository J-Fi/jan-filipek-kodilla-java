package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.client.Client;
import com.kodilla.good.patterns.food2door.producer.Producer;

public class OrderDto {
    private Producer producer;
    private Client client;
    private boolean isPurchased;

    public OrderDto(Producer producer, Client client, boolean isPurchased) {
        this.producer = producer;
        this.client = client;
        this.isPurchased = isPurchased;
    }

    public Producer getProducer() {
        return producer;
    }

    public Client getClient() {
        return client;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
