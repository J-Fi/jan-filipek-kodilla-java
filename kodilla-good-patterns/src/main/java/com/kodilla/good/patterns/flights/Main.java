package com.kodilla.good.patterns.flights;

public class Main {
    public static void main(String[] args) {
        ConnectionRetriever cr = new ConnectionRetriever();

        cr.retrieveConnectionsFromTheCity("Gdańsk");
        cr.retrieveConnectionsToTheCity("Wrocław");
        cr.retrieveNondirectConnections("Gdańsk", "Kielce");
    }
}
