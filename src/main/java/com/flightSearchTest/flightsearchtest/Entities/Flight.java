package com.flightSearchTest.flightsearchtest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airport arrivalAirport;

//    @Column(name = "departureAirport")
//    private String departureAirport;
//
//    @Column(name = "arrivalAirport")
//    private String arrivalAirport;


    @Column(name = "departureTime")
    private LocalDateTime departureTime;

    @Column(name = "arrivalTime")
    private LocalDateTime arrivalTime;

    @Column(name = "price")
    private double price;

}
