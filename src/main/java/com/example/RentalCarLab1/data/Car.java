package com.example.RentalCarLab1.data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue ;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String plateNumber;

    public boolean rent;
    public String brand;
    public int price; 
    


    public Car(String plateNumber, boolean rent, String brand, int price) {
        this.plateNumber = plateNumber;
        this.rent = rent;
        this.brand = brand;
        this.price = price;
    }

   

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    
    public boolean isRented() {
        return rent;
    }

    public void setRented(boolean rent) {
        this.rent = rent;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
