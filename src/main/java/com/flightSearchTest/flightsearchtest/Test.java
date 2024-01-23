package com.flightSearchTest.flightsearchtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Project Started.");
        log.info("Çalış");

    }


}
