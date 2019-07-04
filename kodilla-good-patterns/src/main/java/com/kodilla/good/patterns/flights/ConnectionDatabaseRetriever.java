package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ConnectionDatabaseRetriever {
    public List<Connection> RetrieveConnections() {
        List<Connection> allFlights = new ArrayList<>();

        Connection flight1 = new Connection("Gdańsk", "Warszawa", LocalTime.of(8, 45), LocalTime.of(11, 30));
        Connection flight2 = new Connection("Gdańsk", "Kraków", LocalTime.of(8, 55), LocalTime.of(12, 30));
        Connection flight3 = new Connection("Kraków", "Kielce", LocalTime.of(13, 45), LocalTime.of(17, 30));
        Connection flight4 = new Connection("Warszawa", "Kielce", LocalTime.of(14, 45), LocalTime.of(21, 30));
        Connection flight5 = new Connection("Gdańsk", "Rzeszów", LocalTime.of(8, 35), LocalTime.of(10, 30));
        Connection flight6 = new Connection("Kraków", "Wrocław", LocalTime.of(7, 45), LocalTime.of(9, 30));
        Connection flight7 = new Connection("Szczecin", "Białystok", LocalTime.of(6, 45), LocalTime.of(12, 30));
        Connection flight8 = new Connection("Białystok", "Szczecin", LocalTime.of(15, 55), LocalTime.of(22, 30));
        Connection flight9 = new Connection("Kraków", "Poznań", LocalTime.of(11, 25), LocalTime.of(15, 35));
        Connection flight10 = new Connection("Warszawa", "Wrocław", LocalTime.of(21, 45), LocalTime.of(23, 30));
        Connection flight11 = new Connection("Opole", "Kraków", LocalTime.of(5, 35), LocalTime.of(9, 30));
        Connection flight12 = new Connection("Wrocław", "Warszawa", LocalTime.of(6, 15), LocalTime.of(10, 15));

        allFlights.add(flight1);
        allFlights.add(flight2);
        allFlights.add(flight3);
        allFlights.add(flight4);
        allFlights.add(flight5);
        allFlights.add(flight6);
        allFlights.add(flight7);
        allFlights.add(flight8);
        allFlights.add(flight9);
        allFlights.add(flight10);
        allFlights.add(flight11);
        allFlights.add(flight12);

        return allFlights;
    }

}
