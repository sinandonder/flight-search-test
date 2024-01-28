package com.flightSearchTest.flightsearchtest.controller;

import com.flightSearchTest.flightsearchtest.entities.Flight;
import com.flightSearchTest.flightsearchtest.service.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class PageController {

    private final FlightService flightService;

    public PageController(FlightService flightService) {
        this.flightService = flightService;
    }


    @GetMapping("/")
    public String homePage(Model model) {
        LocalDate localDate = LocalDate.now();

        model.addAttribute("today", localDate);
        model.addAttribute("maxYear", localDate.plusYears(1));

        return "index";
    }

    @GetMapping("/searchFlights")
    public String searchFlights(
            @RequestParam String departureAirport,
            @RequestParam String arrivalAirport,
            @RequestParam String departureDate,
            Model model) {

        List<Flight> flights = flightService.searchFlights(departureAirport, arrivalAirport, LocalDate.parse(departureDate));

        String departure = StringUtils.capitalize(departureAirport);
        String arrival = StringUtils.capitalize(arrivalAirport);

        LocalDate date = LocalDate.parse(departureDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, EEEE");

        String formattedDate = date.format(formatter);


        model.addAttribute("dataList", flights);
        model.addAttribute("pageTitle", departure + " " + arrival + " Uçuşları");
        model.addAttribute("departure", departure);
        model.addAttribute("arrival", arrival);
        model.addAttribute("dateTitle", formattedDate);

        return "flights";
    }

    @GetMapping("all-flights")
    public String allFlights(Model model) {

        List<Flight> flights = flightService.findAll();

        model.addAttribute("dataList", flights);
        model.addAttribute("pageTitle", "Tüm Uçuşlar");
        model.addAttribute("departure", "Tüm");
        model.addAttribute("arrival", "Tüm");
        model.addAttribute("dateTitle", "Tüm Zamanlar");

        return "flights";
    }

}
