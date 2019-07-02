package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.product.SpecificProduct;

public interface PurchaseMethod {
    public boolean purchase (SpecificProduct product, int volumeOfProduct, String producerName);
}
