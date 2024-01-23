package com.flightSearchTest.flightsearchtest.service;

import com.flightSearchTest.flightsearchtest.Entities.Flight;

import java.util.List;

public interface IFlightService {
    List<Flight> getAll();
    void add(Flight flight);
    void update(Flight flight);
    void delete(Flight flight);
    Flight getById(long id);

}
