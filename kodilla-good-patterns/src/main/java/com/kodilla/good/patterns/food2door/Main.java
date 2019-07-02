package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.order.OrderDto;
import com.kodilla.good.patterns.food2door.order.OrderHandlingService;
import com.kodilla.good.patterns.food2door.order.OrderRetriever;

public class Main {
    public static void main(String[] args) {
        OrderRetriever or = new OrderRetriever();

        OrderHandlingService ohs1 = new OrderHandlingService(or.retrieve_1());
        OrderDto output1 = ohs1.orderProcess();
        System.out.println("Is the purchase confirmed? " + output1.isPurchased() + " | " + output1.getProducer() + " | " + output1.getClient());

        System.out.println("--------------------------");

        OrderHandlingService ohs2 = new OrderHandlingService(or.retrieve_2());
        OrderDto output2 = ohs2.orderProcess();
        System.out.println("Is the purchase confirmed? " + output2.isPurchased() + " | " + output2.getProducer() + " | " + output2.getClient());

        System.out.println("--------------------------");

        OrderHandlingService ohs3 = new OrderHandlingService(or.retrieve_3());
        OrderDto output3 = ohs3.orderProcess();
        System.out.println("Is the purchase confirmed? " + output3.isPurchased() + " | " + output3.getProducer() + " | " + output3.getClient());
    }
}
