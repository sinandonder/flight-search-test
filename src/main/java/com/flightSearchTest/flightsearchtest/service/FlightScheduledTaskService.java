package com.flightSearchTest.flightsearchtest.service;

import com.flightSearchTest.flightsearchtest.dataAccess.FlightRepository;
import com.flightSearchTest.flightsearchtest.entities.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FlightScheduledTaskService{
    private final FlightRepository flightRepository;
    private final ApiService apiService;

    @Autowired
    public FlightScheduledTaskService(FlightRepository flightRepository, ApiService apiService) {
        this.flightRepository = flightRepository;
        this.apiService = apiService;
    }

    @Scheduled(fixedRate = 5000)
    public void fetchFlightsAndUpdateRepository() {

        List<Flight> flights = apiService.fetchDataFromApi();
        if (flights != null) {
            flightRepository.deleteAll();
            flightRepository.saveAll(flights);
        }


        System.out.println("Api' dan veriler Çekildi ve Veritabanı Güncellendi!");

    }

}
