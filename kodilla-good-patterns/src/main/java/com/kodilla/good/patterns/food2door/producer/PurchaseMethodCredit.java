package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.product.SpecificProduct;

public class PurchaseMethodCredit implements PurchaseMethod {
    public boolean purchase(SpecificProduct product, int volumeOfProduct, String producerName) {
        System.out.println("The product called " + product.getProductName() + " was purchased on credit in amount of " + volumeOfProduct + " from the producer called: " + producerName);
        return true;
    }
}
