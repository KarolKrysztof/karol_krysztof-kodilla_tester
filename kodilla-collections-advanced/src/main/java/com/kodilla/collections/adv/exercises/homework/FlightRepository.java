package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "Dublin"));
        flightList.add(new Flight("Warsaw", "Shanghai"));
        flightList.add(new Flight("Krakow", "London"));
        flightList.add(new Flight("Paris", "Barcelona"));
        flightList.add(new Flight("Barcelona", "Madrid"));
        flightList.add(new Flight("Rome", "Frankfurt"));
        flightList.add(new Flight("New York", "Warsaw"));
        flightList.add(new Flight("Moscow", "Warsaw"));
        return flightList;
    }

}
