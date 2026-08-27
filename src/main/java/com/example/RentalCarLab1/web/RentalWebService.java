package com.example.RentalCarLab1.web;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.RentalCarLab1.data.Car;
import com.example.RentalCarLab1.service.RentalService;

@RestController
public class RentalWebService {

    private final RentalService rentalService;

    public RentalWebService(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/cars")
    public List<Car> listOfCars() {
        return rentalService.listOfCars();
    }

    @GetMapping("/cars/{plateNumber}")
    public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception {
        return rentalService.aCar(plateNumber);
    }
}