package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.product.SpecificProduct;

public class PurchaseMethodPaypal implements PurchaseMethod {
    public boolean purchase(SpecificProduct product, int volumeOfProduct, String producerName) {
        System.out.println("The product called " + product.getProductName() + " was purchased by PayPal in amount of " + volumeOfProduct + " from the producer called: " + producerName);
        return true;
    }
}
