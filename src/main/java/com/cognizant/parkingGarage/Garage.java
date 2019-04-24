package com.cognizant.parkingGarage;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.cognizant.parkingGarage.Car;
public class Garage {
int hrlyRate = 5;
int mximumRate = 30;

public int TotalCharge(Car car){
    if(car.monthlyMember == true)
        return 0;

}


    public static void main(String[] args) {
    Car car = new Car("jdhdjdk", true, 2,3);

        TotalCharge(car);

    }




}
