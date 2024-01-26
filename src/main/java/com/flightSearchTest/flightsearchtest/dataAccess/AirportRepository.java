package com.flightSearchTest.flightsearchtest.dataAccess;

import com.flightSearchTest.flightsearchtest.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
