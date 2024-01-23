package com.flightSearchTest.flightsearchtest.controller;

import com.flightSearchTest.flightsearchtest.Entities.Flight;
import com.flightSearchTest.flightsearchtest.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



@RestController
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }


    @GetMapping("/flights")
    public Iterable<Flight> get() {
        return flightService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Flight flight) {
        flightService.add(flight);
    }

    @PostMapping("/update")
    public void update(@RequestBody Flight flight) {
       // flightService.update(flight);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {

    }

    @GetMapping("/flights/{id}")
    public Flight getById(@PathVariable long id) {
        Flight flight = flightService.getById(id);
        if (flight == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return flight;
    }
}
