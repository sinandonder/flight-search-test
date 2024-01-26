package com.flightSearchTest.flightsearchtest.service;

import com.flightSearchTest.flightsearchtest.entities.Flight;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    private final RestTemplate restTemplate;

    public ApiService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Value("${mock.api.url}")
    private String apiUrl;

    public List<Flight> fetchDataFromApi() {
        Flight[] flightsArray = null;
        try {
            flightsArray = restTemplate.getForObject(apiUrl, Flight[].class);
        } catch (RestClientException exception) {
            System.out.println("[ERROR] The data coming from the API is corrupt or the connection cannot be " +
                    "established with the API. Database Not Updated!");
        }


        if (flightsArray == null)
            return null;

        return Arrays.asList(flightsArray);
    }


}
