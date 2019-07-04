package com.kodilla.good.patterns.flights;

import java.time.LocalTime;

public class Connection {
    private String departureCity;
    private String arrivalCity;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    public Connection(String departureCity, String arrivalCity, LocalTime departureTime, LocalTime arrivalTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Connection)) return false;

        Connection that = (Connection) o;

        if (!getDepartureCity().equals(that.getDepartureCity())) return false;
        if (!getArrivalCity().equals(that.getArrivalCity())) return false;
        if (!getDepartureTime().equals(that.getDepartureTime())) return false;
        return getArrivalTime().equals(that.getArrivalTime());
    }

    @Override
    public int hashCode() {
        int result = getDepartureCity().hashCode();
        result = 31 * result + getArrivalCity().hashCode();
        result = 31 * result + getDepartureTime().hashCode();
        result = 31 * result + getArrivalTime().hashCode();
        return result;
    }
}
