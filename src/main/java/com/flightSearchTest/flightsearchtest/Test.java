package com.flightSearchTest.flightsearchtest;

import com.flightSearchTest.flightsearchtest.dataAccess.AirportRepository;
import com.flightSearchTest.flightsearchtest.dataAccess.FlightRepository;
import com.flightSearchTest.flightsearchtest.entities.Flight;
import com.flightSearchTest.flightsearchtest.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Test implements CommandLineRunner {
    FlightRepository flightRepository;
    AirportRepository airportRepository;


    private final ApiService apiService;

    @Autowired
    public Test(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void run(String... args) throws Exception {

        //findAll

//        for (Flight flight : flightRepository.findAll()) {
//            System.out.println(flight.toString());
//        }


//        try {
//            File file = new File("C:\\Drive\\flight-search-test\\src\\main\\java\\com\\flightSearchTest\\flightsearchtest\\airports.txt");
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNextLine()) {
//                String[] row = scanner.nextLine().split("\t");
//
//                Airport airport = new Airport();
//
//                System.out.println(row[2] + " " + row[3] + " " + row[0]);
//
//                if (row[2] == null || row[3] == null || row[0] == null)
//                    System.out.println("\n\nnNULL\n\n");
//
//
//
//                airport.setCode(row[2]);
//                airport.setName(row[3]);
//                airport.setCity(row[0]);
//
//                airportRepository.save(airport);
//
//            }
//        } catch (FileNotFoundException exception) {
//            System.out.println("File Not Found!");
//        }


//        List<Flight> flights = apiService.fetchDataFromApi();
//
//
//        for (Flight flight : flights)
//            System.out.println(flight.getDepartureAirport() + " " + flight.getArrivalAirport());




    }
}
