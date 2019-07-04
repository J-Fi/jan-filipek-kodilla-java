package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.client.Client;
import com.kodilla.good.patterns.food2door.producer.*;
import com.kodilla.good.patterns.food2door.product.SpecificProduct;

public class OrderRetriever {

    Client client = new Client("Jan Filipek", "janflpk@yahoo.com", 123452);

    public Order retrieve_1() {
        ExtraFoodShop producer_1 = new ExtraFoodShop("ExtraFoodShop", new CommunicationMethodEmail(), new RepositoryMethodServer(), new PurchaseMethodCredit());
        SpecificProduct product_1 = new SpecificProduct("Carrot");
        int volumeOfProduct = 3;

        return new Order(producer_1, client, product_1, volumeOfProduct);
    }

    public Order retrieve_2() {
        HealthyShop producer_2 = new HealthyShop("HealthyShop", new CommunicationMethodSms(), new RepositoryMethodFile(), new PurchaseMethodPaypal());
        SpecificProduct product_2 = new SpecificProduct("Apple");
        int volumeOfProduct = 5;

        return new Order(producer_2, client, product_2, volumeOfProduct);
    }

    public Order retrieve_3() {
        GlutenFreeShop producer_3 = new GlutenFreeShop("GlutenFreeShop", new CommunicationMethodEmail(), new RepositoryMethodFile(), new PurchaseMethodCredit());
        SpecificProduct product_3 = new SpecificProduct("Pear");
        int volumeOfProduct = 13;

        return new Order(producer_3, client, product_3, volumeOfProduct);
    }
}
