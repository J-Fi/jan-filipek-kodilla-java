package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.client.Client;
import com.kodilla.good.patterns.food2door.producer.Producer;
import com.kodilla.good.patterns.food2door.product.SpecificProduct;

public class Order {
    private Producer producer;
    private Client client;
    private SpecificProduct product;
    private int volumeOfProduct;

    public Order(Producer producer, Client client, SpecificProduct product, int volumeOfProduct) {
        this.producer = producer;
        this.client = client;
        this.product = product;
        this.volumeOfProduct = volumeOfProduct;
    }

    public Producer getProducer() {
        return producer;
    }

    public Client getClient() {
        return client;
    }

    public SpecificProduct getProduct() {
        return product;
    }

    public int getVolumeOfProduct() {
        return volumeOfProduct;
    }
}
