package com.flightSearchTest.flightsearchtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // Scheduled Backgroud Job' lari etkinleştirmek için gerekli anotasyon
public class FlightSearchTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSearchTestApplication.class, args);
	}

}
