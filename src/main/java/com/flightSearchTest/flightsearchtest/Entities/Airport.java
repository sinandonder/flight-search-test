package com.flightSearchTest.flightsearchtest.Entities;


import lombok.*;
import java.io.Serializable;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Airport implements Serializable {
    private Long id;
    private String city;

}
