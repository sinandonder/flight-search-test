package com.flightSearchTest.flightsearchtest.controller;

import com.flightSearchTest.flightsearchtest.Entities.Flight;
import com.flightSearchTest.flightsearchtest.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    private final IFlightService flightService;

    @Autowired
    public FlightController(IFlightService flightService) {
        this.flightService = flightService;
    }


    @GetMapping("/flights")
    public List<Flight> get() {
        return flightService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Flight flight) {
        flightService.add(flight);
    }

    @PostMapping("/update")
    public void update(@RequestBody Flight flight) {
        flightService.update(flight);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Flight flight) {
        flightService.delete(flight);
    }

    @GetMapping("/flights/{id}")
    public Flight getById(@PathVariable long id) {
        Flight flight = flightService.getById(id);
        System.out.println(flight.getArrivalAirport() + " " + flight.getDepartureAirport());
        return flight;
    }
}
