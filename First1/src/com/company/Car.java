package com.company;

public class Car {
    int weight = 5000;
    int heightAboveGroundMeters = 1;
    int countSeats = 4;
    String color = "Orange";
    int countDoors = 4;
    protected boolean carDestroyed = false;

    public String getColor()
    {
        return this.color;
    }

    public void honk()
    {
        if(!this.carDestroyed)
            System.out.println("Beep");
    }

    public String maxWeightInCar()
    {
        return "Max weight in the car: " + (int)(this.weight/4);
    }

    public void DestroyCar()
    {
        this.carDestroyed = true;
    }

    public boolean IsCarGood()
    {
        if(this.countSeats == this.countDoors && !this.carDestroyed)
            return true;
        return false;
    }

    public String getCarInfo()
    {
        String result = "Error getting information about the car! It has been destroyed.";
        if(!this.carDestroyed)
            result = "Weight: " + this.weight + "\nHeight above ground meters: " + this.heightAboveGroundMeters + "\nColor: " + this.color + "\nCount seats: " + this.countSeats + "\nCount doors: " + this.countDoors;

        return result;
    }

}
