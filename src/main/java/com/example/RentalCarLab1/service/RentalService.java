package com.example.RentalCarLab1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RentalCarLab1.data.Car;
import com.example.RentalCarLab1.data.Dates;

@Service
public class RentalService {
   private List<Car> cars = new ArrayList<>();

    public RentalService() {
        cars.add(new Car("11A", false, "ferrari", 100));
        cars.add(new Car("22B", true, "lamborghini", 200));
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

    public Car aCar(String plateNumber)throws Exception {
        for (Car car:cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        throw new Exception("Car not found");
    }


    public void rentOrGetBack(
            String plateNumber,
            boolean rent,
            Dates dates) throws Exception {

        Car car = aCar(plateNumber);

        if (rent) {
            if (car.isRented()) {
                throw new Exception("Car is already rented");
            }
            car.setRented(true);

            if (dates != null) {
                System.out.println(
                    "Rental from " +
                    dates.getBegin() +
                    " to " +
                    dates.getEnd()
                );
            }
        } 
        else {
            if (!car.isRented()) {
                throw new Exception("Car is already available");
            }
            car.setRented(false);
        }
    }


}
