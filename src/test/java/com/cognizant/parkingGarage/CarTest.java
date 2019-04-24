package com.cognizant.parkingGarage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class CarTest {

    Garage garage = new Garage();


@Test
public void CarHasEnteredTheGarage(){
    //Setup
    Car car1 = new Car("yuyuoi",true, 2, 5);
     int actual = car1.TotalCharge();
     int expected = 0;
    Assert.assertArrayEquals(expected, actual);

}


}

