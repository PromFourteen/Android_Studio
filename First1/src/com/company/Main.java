package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.time.*;

public class Main {

    public static void main(String[] args){
       Scanner scannerMain = new Scanner(System.in);

       System.out.println("First car:");
       PassengerCar car = new PassengerCar();
       car.countSeats = 4;
       car.countDoors = 2;
       car.hasSpoiler = true;
       car.honk("qq");
       System.out.println(car.getCarInfo());
       if(car.IsCarGood())
           System.out.println("All ok");
       else
           System.out.println("Wtf");

       System.out.println("\n\nSecond car:");
       Car carSec = new Car();
       System.out.println(carSec.maxWeightInCar());
       //carSec.DestroyCar();
       carSec.countSeats = 6;
       carSec.countDoors = 6;
       carSec.weight = 11500;
       carSec.color = "white";
       carSec.honk();
       System.out.println(carSec.getCarInfo());
       if(carSec.IsCarGood())
           System.out.println("All ok.");
       else
           System.out.println("Car is not ok!");
    }
}
