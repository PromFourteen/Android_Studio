package com.company;

public class PassengerCar extends Car{

    boolean hasSpoiler = false;
    String name = "First";
    boolean hasTrailer = false;
    int countAbsorbers = 5;


    public void honk(String value)
    {
        if(!this.carDestroyed)
            System.out.println("Beep " + value);
    }

    @Override
    public String maxWeightInCar() {
        return "Max weight in the car: " + (int)(this.weight/8*((int)this.countSeats/3));
    }

    public String getCarInfo()
    {
        String result = "Error getting information about the car! It has been destroyed.";
        if(!this.carDestroyed)
            result = "Weight: " + this.weight + "\nHeight above ground meters: " + this.heightAboveGroundMeters + "\nColor: " + this.color + "\nCount seats: " + this.countSeats + "\nCount doors: " + this.countDoors + "\nHas spoiler: " + this.hasSpoiler + "\nName: " + this.name + "\nHas trailer: " + this.hasTrailer + "\nCount absorbes: " + this.countAbsorbers;

        return result;
    }

    public void RepaintCar(String NewColor)
    {
        if(!this.carDestroyed)
            this.color = NewColor;
    }

}
