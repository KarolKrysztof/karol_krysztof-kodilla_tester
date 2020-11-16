package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFlightFinderFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder(FlightRepository.getFlightTable());
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("Warsaw", "Dublin"));
        flightList.add(new Flight("Warsaw", "Shanghai"));
        // when
        List<Flight> result = flightFinder.findFlightFrom("Warsaw");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Dublin"));
        expectedList.add(new Flight("Warsaw", "Shanghai"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFlightFinderTo() {
        // given
        FlightFinder flightFinder = new FlightFinder(FlightRepository.getFlightTable());
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("New York", "Warsaw"));
        flightList.add(new Flight("Moscow", "Warsaw"));
        // when
        List<Flight> result = flightFinder.findFlightTo("Warsaw");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("New York", "Warsaw"));
        expectedList.add(new Flight("Moscow", "Warsaw"));
        assertEquals(expectedList, result);

    }

}