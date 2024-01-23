package com.flightSearchTest.flightsearchtest.DataAccess;

import com.flightSearchTest.flightsearchtest.Entities.Flight;

import java.util.List;

public interface IFlightDal {

    List<Flight> getAll();
    void add(Flight flight);
    void update(Flight flight);
    void delete(Flight flight);
    Flight getById(long id);

}
