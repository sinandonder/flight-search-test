package com.flightSearchTest.flightsearchtest.controller;

import com.flightSearchTest.flightsearchtest.entities.Flight;
import com.flightSearchTest.flightsearchtest.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("api/")
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
    public Flight add(@RequestBody Flight flight) {
        return flightService.add(flight);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        flightService.delete(id);
    }

    @GetMapping("/flights/{id}")
    public Flight getById(@PathVariable long id) {
        Flight flight = flightService.getById(id);
        if (flight == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return flight;
    }

    @GetMapping("/searchFlights")
    public List<Flight> searchFlights(
            @RequestParam String departureAirport,
            @RequestParam String arrivalAirport,
            @RequestParam String departureDate) {

        return flightService.searchFlights(departureAirport, arrivalAirport, LocalDate.parse(departureDate));
    }

    @GetMapping("/searchFlightsByDate")
    public List<Flight> searchFlightsByDate(@RequestParam String departureDate) {
        System.out.println(departureDate);
        return flightService.searchByDate(LocalDate.parse(departureDate));
    }

}
