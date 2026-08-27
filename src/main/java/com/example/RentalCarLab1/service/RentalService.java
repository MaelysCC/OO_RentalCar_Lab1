package com.example.RentalCarLab1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.RentalCarLab1.data.Car;

@Service
public class RentalService {
   private List<Car> cars = new ArrayList<>();

    public RentalService() {
        cars.add(new Car("11A", false, "ferrari", "100"));
        cars.add(new Car("22B", true, "lamborghini", "200"));
    }

    public List<Car> listOfCars(){   
        List<Car> listcar = new ArrayList<>();
        for (Car car:cars) {
            if (!car.isRented()) {
                listcar.add(car);
            }
        }
        return listcar;  
    } 

    public Car aCar(@PathVariable("plateNumber") String plateNumber)throws Exception {
        for (Car car:cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        throw new Exception("Car not found");
    }


}
