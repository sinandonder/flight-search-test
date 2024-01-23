package com.flightSearchTest.flightsearchtest;

import com.flightSearchTest.flightsearchtest.DataAccess.FlightRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test implements CommandLineRunner {


    FlightRepository flightRepository;

    @Override
    public void run(String... args) throws Exception {

        //findAll

//        for (Flight flight : flightRepository.findAll()) {
//            System.out.println(flight.toString());
//        }





    }


}
