package edu.sdccd.cisc191;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InsertVehicles {

    private static final Logger log = LoggerFactory.getLogger(InsertVehicles.class);

    public static void main(String[] args) {
        SpringApplication.run(InsertVehicles.class);
    }

    @Bean
    public CommandLineRunner demo(VehicleRepository repository) {
        return (args) -> {
            // save a vehicle
            Vehicle vehicle = new Vehicle("Honda", "Civic", 2020);
            repository.save(vehicle);

            log.info("Vehicle saved: {}", vehicle);
        };
    }
}
