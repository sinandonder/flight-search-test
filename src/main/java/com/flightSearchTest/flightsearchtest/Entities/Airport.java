package com.flightSearchTest.flightsearchtest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "airport")
public class Airport {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "departureAirport")
    private List<Flight> departure_flights;

    @OneToMany(mappedBy = "arrivalAirport")
    private List<Flight> arrival_flights;

}
