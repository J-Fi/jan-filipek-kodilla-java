package com.kodilla.exception.test;

public class FlightExceptionHandling {
    public static void main(String[] args) {
        Flight flight = new Flight("Gdansk", "Poznan");
        FlightChecker flightChecker = new FlightChecker();

        try {
            boolean result = flightChecker.findFlight(flight);
            if (result == true) {
                System.out.println("Jest jeszcze kilka wolnych miejsc. Czy chcesz zarezerwować?");
            } else {
                System.out.println("Brak wolnych miejsc. Może chcesz wybrać inny kierunek?");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Wybrane połączenie nie istnieje. " + e);
        }
    }

}
