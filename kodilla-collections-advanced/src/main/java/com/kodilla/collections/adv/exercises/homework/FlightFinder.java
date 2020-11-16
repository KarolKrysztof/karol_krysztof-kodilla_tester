package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private List<Flight> flightList;

    public FlightFinder (List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> findFlightFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getDeparture().equals(departure)) {
                flightsFrom.add(flight);
            }
        } return flightsFrom;

    }

    public List<Flight> findFlightTo (String arrival) {
        List<Flight> flightTo = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getArrival().equals(arrival)) {
                flightTo.add(flight);
            }
        } return flightTo;

    }

}
