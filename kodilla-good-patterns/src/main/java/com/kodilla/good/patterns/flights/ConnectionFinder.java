package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectionFinder {
    public List<Connection> getFlightsFromTheCity (List<Connection> allFlights, String departureCity) {
        return allFlights.stream()
                .filter(f -> f.getDepartureCity().equals(departureCity))
                .collect(Collectors.toList());
    }

    public List<Connection> getFlightsToTheCity (List<Connection> allFlights, String arrivalCity) {
        return allFlights.stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
    }

    public List<NonDirectFlight> getViaFlights (List<Connection> allFlights, String departureCity, String arrivalCity) {
        List<NonDirectFlight> allViaFlights = new ArrayList<>();

        List<Connection> allFlightsFrom = getFlightsFromTheCity(allFlights, departureCity);
        for (Connection flightFrom : allFlightsFrom) {
            for (Connection flightTo : allFlights) {
                if (flightFrom.getArrivalCity().equals(flightTo.getDepartureCity()) && flightTo.getArrivalCity().equals(arrivalCity)) {
                    allViaFlights.add(new NonDirectFlight(departureCity, arrivalCity, flightTo.getDepartureCity(),
                                                            flightFrom.getDepartureTime(), flightFrom.getArrivalTime(),
                                                            flightTo.getDepartureTime(), flightTo.getArrivalTime()));
                }
            }
        }
        return allViaFlights;
    }

    public List<Connection> getViaFlights_2 (List<Connection> allFlights, String departureCity, String arrivalCity) {
        return allFlights.stream()
                .filter(f -> f.getTransferCity() != null)
                .filter(f -> f.getDepartureCity().equals(departureCity) && f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
    }
}
