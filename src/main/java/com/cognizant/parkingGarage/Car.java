package com.cognizant.parkingGarage;

import java.time.LocalDateTime;
import java.util.Objects;

public class Car {


    String licPlate;
    Boolean monthlyMember;
     int carEntryTime;
     int carLeaveTIme;

    //constructor
    public Car(String licPlate, boolean monthlyMember, int carEntryTime, int carLeaveTIme){

        this.licPlate= licPlate;
        this.monthlyMember = monthlyMember;
        this.carEntryTime = carEntryTime;
        this.carLeaveTIme = carLeaveTIme;

    }

    //getter
    public String getLicPlate() {
        return licPlate;
    }

    public Boolean getMonthlyMember() {
        return monthlyMember;
    }
    public int getCarEntryTime() {
        return carEntryTime;
    }
    public int getCarLeaveTIme() {
        return carLeaveTIme;
    }

    //setter
    public void setLicPlate(String licPlate) {
        this.licPlate = licPlate;
    }

    public void setMonthlyMember(Boolean monthlyMember) {
        this.monthlyMember = monthlyMember;
    }
    public void setCarEntryTime(int carEntryTime) {
        this.carEntryTime = carEntryTime;
    }
    public void setCarLeaveTIme(int carLeaveTIme) {
        this.carLeaveTIme = carLeaveTIme;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getLicPlate().equals(car.getLicPlate());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getLicPlate());
    }
}

