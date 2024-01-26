package com.flightSearchTest.flightsearchtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // Scheduled Background Jobs Enabled
public class FlightSearchTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSearchTestApplication.class, args);
	}

}
