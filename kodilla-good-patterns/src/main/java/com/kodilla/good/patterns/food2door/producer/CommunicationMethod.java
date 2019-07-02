package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.client.Client;

public interface CommunicationMethod {
    public void inform(Client client);
}
