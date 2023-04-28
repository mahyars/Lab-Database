package edu.sdccd.cisc191;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReadVehicles {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ReadVehicles.class, args);
        VehicleRepository vehicleRepository = context.getBean(VehicleRepository.class);

        System.out.println("Vehicles found with find:");
        System.out.println("-------------------------");
        for (Vehicle vehicle : vehicleRepository.findAll()) {
            System.out.println(vehicle.toString());
        }
        System.out.println("");

        context.close();
    }
}
