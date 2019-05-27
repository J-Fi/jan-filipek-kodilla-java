package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> connections = new HashMap<>();
        connections.put("Warsaw", true);
        connections.put("Manchester", true);
        connections.put("Wroclaw", false);
        connections.put("Gdansk", true);

        if ( !(connections.containsKey(flight.getArrivalAirport()) &&
                connections.containsKey(flight.getDepartureAirport())) ||
                flight.getDepartureAirport() == flight.getArrivalAirport()) {
            throw new RouteNotFoundException();
        } else {
            return connections.get(flight.getArrivalAirport()) && connections.get(flight.getDepartureAirport());
        }
    }
}
