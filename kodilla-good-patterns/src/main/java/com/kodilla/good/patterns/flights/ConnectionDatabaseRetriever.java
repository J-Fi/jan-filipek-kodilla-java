package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectionDatabaseRetriever {
    public List<Connection> RetrieveConnections() {
        List<Connection> allFlights = new ArrayList<>();

        Connection flight1 = new Connection("Gdańsk", "Warszawa", Arrays.asList(), LocalTime.of(8, 45), LocalTime.of(11, 30));
        Connection flight2 = new Connection("Gdańsk", "Kraków", Arrays.asList("Warszawa"), LocalTime.of(8, 55), LocalTime.of(12, 30));
        Connection flight3 = new Connection("Kraków", "Kielce", Arrays.asList("Poznań"), LocalTime.of(13, 45), LocalTime.of(17, 30));
        Connection flight4 = new Connection("Warszawa", "Kielce", Arrays.asList("Radom", "Łódź"), LocalTime.of(14, 45), LocalTime.of(21, 30));
        Connection flight5 = new Connection("Gdańsk", "Rzeszów", Arrays.asList("Kraków", "Warszawa", "Lublin"), LocalTime.of(8, 35), LocalTime.of(10, 30));
        Connection flight6 = new Connection("Kraków", "Wrocław", Arrays.asList(), LocalTime.of(7, 45), LocalTime.of(9, 30));
        Connection flight7 = new Connection("Szczecin", "Białystok", Arrays.asList("Warszawa"), LocalTime.of(6, 45), LocalTime.of(12, 30));
        Connection flight8 = new Connection("Białystok", "Szczecin", Arrays.asList("Gdańsk"), LocalTime.of(15, 55), LocalTime.of(22, 30));
        Connection flight9 = new Connection("Kraków", "Poznań", Arrays.asList(), LocalTime.of(11, 25), LocalTime.of(15, 35));
        Connection flight10 = new Connection("Warszawa", "Wrocław", Arrays.asList("Bełchatów"), LocalTime.of(21, 45), LocalTime.of(23, 30));
        Connection flight11 = new Connection("Opole", "Kraków", Arrays.asList(), LocalTime.of(5, 35), LocalTime.of(9, 30));
        Connection flight12 = new Connection("Wrocław", "Warszawa", Arrays.asList("Poznań"), LocalTime.of(6, 15), LocalTime.of(10, 15));

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
