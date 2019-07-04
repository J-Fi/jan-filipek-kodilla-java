package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.order.Order;

public class ExtraFoodShop implements Producer {
    private String producerName;
    private CommunicationMethod communicationMethod;
    private RepositoryMethod repositoryMethod;
    private PurchaseMethod purchaseMethod;

    public ExtraFoodShop (String producerName,
                            CommunicationMethod communicationMethod,
                            RepositoryMethod repositoryMethod,
                            PurchaseMethod purchaseMethod) {
        this.producerName = producerName;
        this.communicationMethod = communicationMethod;
        this.repositoryMethod = repositoryMethod;
        this.purchaseMethod = purchaseMethod;
    }

    public String getProducerName() {
        return producerName;
    }

    public boolean process(Order order) {
        boolean isPurchased = purchaseMethod.purchase(order.getProduct(),order.getVolumeOfProduct(), getProducerName());
        if (isPurchased) {
            communicationMethod.inform(order.getClient());
            repositoryMethod.record(order);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Producer: " + "\"" + producerName + '\"';
    }
}
