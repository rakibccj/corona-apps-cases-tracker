package com.rakib.coronaappscasestracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaAppsCasesTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaAppsCasesTrackerApplication.class, args);
    }

}
