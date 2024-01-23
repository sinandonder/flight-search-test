package com.flightSearchTest.flightsearchtest.service;

import com.flightSearchTest.flightsearchtest.DataAccess.IFlightDal;
import com.flightSearchTest.flightsearchtest.Entities.Airport;
import com.flightSearchTest.flightsearchtest.Entities.Flight;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService implements IFlightService {

    private final IFlightDal flightDal;

    @Autowired
    public FlightService(IFlightDal flightDal) {
        this.flightDal = flightDal;
    }

    @Override
    @Transactional
    public List<Flight> getAll() {
        return this.flightDal.getAll();
    }

    @Override
    @Transactional
    public void add(Flight flight) {



        this.flightDal.add(flight);
    }

    @Override
    @Transactional
    public void update(Flight flight) {
        this.flightDal.update(flight);
    }

    @Override
    @Transactional
    public void delete(Flight flight) {
        this.flightDal.delete(flight);
    }

    @Override
    @Transactional
    public Flight getById(long id) {
        return this.flightDal.getById(id);
    }


}
