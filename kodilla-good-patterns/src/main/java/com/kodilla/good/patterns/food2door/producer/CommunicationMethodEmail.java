package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.client.Client;

public class CommunicationMethodEmail implements CommunicationMethod {
    @Override
    public void inform(Client client) {
        System.out.println("The client named " + client.getName() + " was informed by email: " + client.getEmail());
    }
}
