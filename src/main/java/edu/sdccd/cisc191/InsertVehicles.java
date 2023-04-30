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
    public CommandLineRunner insertVehiclesDemo(VehicleRepository repository) {
        return (args) -> {
            // Create and set the properties of a new Vehicle object
            Vehicle vehicle = new Vehicle();
            vehicle.setMake("Lexus");
            vehicle.setModel("RX350");
            vehicle.setYear(2023);

            // Save the Vehicle object to the database
            repository.save(vehicle);
        };
    }
}
