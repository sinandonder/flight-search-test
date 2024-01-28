package com.flightSearchTest.flightsearchtest.controller;

import com.flightSearchTest.flightsearchtest.entities.Airport;
import com.flightSearchTest.flightsearchtest.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/airport")
public class AirportController {

    private final AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }


    @GetMapping("/airports")
    public List<Airport> getAirpots() {
        return this.airportService.findAll();
    }


}
