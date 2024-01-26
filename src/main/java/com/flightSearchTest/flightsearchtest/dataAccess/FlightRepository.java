package com.flightSearchTest.flightsearchtest.dataAccess;

import com.flightSearchTest.flightsearchtest.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

//    List<Flight> findByDepartureAirportAndArrivalAirportAndDepartureDateTime(
//            String departureAirport, String arrivalAirport, LocalDateTime departureDateTime);


    @Query("SELECT f FROM Flight f WHERE DATE(f.departureDateTime) = :date AND " +
            "f.departureAirport = :departureAirport AND f.arrivalAirport = :arrivalAirport")
    List<Flight> findByDepartureAirportAndArrivalAirportAndDepartureDateTime(
            @Param("date") LocalDate date,
            @Param("departureAirport") String departureAirport,
            @Param("arrivalAirport") String arrivalAirport);

    @Query("SELECT f FROM Flight f WHERE DATE(f.departureDateTime) = :date")
    List<Flight> findByDate(@Param("date") LocalDate date);

}
