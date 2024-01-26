package com.flightSearchTest.flightsearchtest.service;

import com.flightSearchTest.flightsearchtest.dataAccess.FlightRepository;
import com.flightSearchTest.flightsearchtest.entities.Flight;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findAll() {
        return this.flightRepository.findAll();
    }

    public Flight add(Flight flight) {
        return this.flightRepository.save(flight);
    }

    public void delete(Long id) {
        flightRepository.deleteById(id);
    }

    public Flight getById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public List<Flight> searchFlights(String departureAirport, String arrivalAirport, LocalDate departureDate) {
       return flightRepository.findByDepartureAirportAndArrivalAirportAndDepartureDateTime(
               departureDate, departureAirport, arrivalAirport);
    }



    public List<Flight> searchByDate(LocalDate localDate) {
        return flightRepository.findByDate(localDate);
    }


}
