package com.kodilla.good.patterns.flights;

import java.time.LocalTime;

public class NonDirectFlight {
    private String departureCity;
    private String arrivalCity;
    private String viaCity;
    private LocalTime departureTime;
    private LocalTime arrivalTimeAtViaCity;
    private LocalTime departureTimeFromViaCity;
    private LocalTime arrivalTime;

    public NonDirectFlight(String departureCity, String arrivalCity,
                           String viaCity, LocalTime departureTime,
                           LocalTime arrivalTimeAtViaCity,
                           LocalTime departureTimeFromViaCity, LocalTime arrivalTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.viaCity = viaCity;
        this.departureTime = departureTime;
        this.arrivalTimeAtViaCity = arrivalTimeAtViaCity;
        this.departureTimeFromViaCity = departureTimeFromViaCity;
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getViaCity() {
        return viaCity;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTimeAtViaCity() {
        return arrivalTimeAtViaCity;
    }

    public LocalTime getDepartureTimeFromViaCity() {
        return departureTimeFromViaCity;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonDirectFlight)) return false;

        NonDirectFlight that = (NonDirectFlight) o;

        if (!getDepartureCity().equals(that.getDepartureCity())) return false;
        if (!getArrivalCity().equals(that.getArrivalCity())) return false;
        if (!getViaCity().equals(that.getViaCity())) return false;
        if (!getDepartureTime().equals(that.getDepartureTime())) return false;
        if (!getArrivalTimeAtViaCity().equals(that.getArrivalTimeAtViaCity())) return false;
        if (!getDepartureTimeFromViaCity().equals(that.getDepartureTimeFromViaCity())) return false;
        return getArrivalTime().equals(that.getArrivalTime());
    }

    @Override
    public int hashCode() {
        int result = getDepartureCity().hashCode();
        result = 31 * result + getArrivalCity().hashCode();
        result = 31 * result + getViaCity().hashCode();
        result = 31 * result + getDepartureTime().hashCode();
        result = 31 * result + getArrivalTimeAtViaCity().hashCode();
        result = 31 * result + getDepartureTimeFromViaCity().hashCode();
        result = 31 * result + getArrivalTime().hashCode();
        return result;
    }
}
