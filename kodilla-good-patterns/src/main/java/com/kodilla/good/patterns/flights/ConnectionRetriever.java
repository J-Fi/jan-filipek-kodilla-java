package com.kodilla.good.patterns.flights;

import java.util.List;

public class ConnectionRetriever {

    private ConnectionFinder cf;
    private ConnectionDatabaseRetriever cdr;

    public ConnectionRetriever() {
        this.cf = new ConnectionFinder();
        this.cdr = new ConnectionDatabaseRetriever();
    }

/*    public void retrieveNondirectConnections(String departureCity, String arrivalCity) {
        List<NonDirectFlight> viaFlights = cf.getViaFlights(cdr.RetrieveConnections(),departureCity, arrivalCity);
        for (NonDirectFlight i : viaFlights) {
            System.out.println("From " + i.getDepartureCity() + "(Time: " + i.getDepartureTime() + ")" +
                    ", To: " + i.getArrivalCity() + "(Time: " + i.getArrivalTime() + ")"
                    + ", via: " + i.getViaCity() + "(Take-off time: " + i.getDepartureTime() + ")");
        }
    }*/

    public void retrieveNondirectConnections_2 (String departureCity, String arrivalCity) {
        List<Connection> viaFlights = cf.getViaFlights_2(cdr.RetrieveConnections(),departureCity, arrivalCity);
        for (Connection i : viaFlights) {
            for (String cityName : i.getTransferCity()){
                System.out.println("From " + i.getDepartureCity() + "(Time: " + i.getDepartureTime() + ")" +
                        ", To: " + i.getArrivalCity() + "(Time: " + i.getArrivalTime() + ")"
                        + ", via: " + cityName);
            }
        }
    }

    public void retrieveConnectionsFromTheCity (String departureCity) {
        List<Connection> flightsFrom = cf.getFlightsFromTheCity(cdr.RetrieveConnections(), departureCity);
        for (Connection i : flightsFrom) {
            System.out.println("From " + i.getDepartureCity() + "(Time: " + i.getDepartureTime() + ")" +
                    ", To: " + i.getArrivalCity() + "(Time: " + i.getArrivalTime() + ")");
        }
    }

    public void retrieveConnectionsToTheCity(String arrivalCity) {
        List<Connection> flightsTo = cf.getFlightsToTheCity(cdr.RetrieveConnections(), arrivalCity);
        for (Connection i : flightsTo) {
            System.out.println("From " + i.getDepartureCity() + "(Time: " + i.getDepartureTime() + ")" +
                    ", To: " + i.getArrivalCity() + "(Time: " + i.getArrivalTime() + ")");
        }
    }
}
