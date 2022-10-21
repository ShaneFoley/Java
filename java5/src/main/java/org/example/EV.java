package org.example;

public class EV implements Vehicle{

    String name;
    int topSpeed;
    int passengers;
    double range;

    EV(String name, int topSpeed, int passengers, double range ){
        if (name == "") throw new IllegalArgumentException("CAR NEEDS NAME");
        if (topSpeed < 0) throw new IllegalArgumentException("Cannot have negative val for topspeed");
        if (passengers <= 1) throw new IllegalArgumentException("Must have room for one passenger");
        if (range < 130) throw new IllegalArgumentException("Range not enough");
        this.name = name;
        this.topSpeed = topSpeed;
        this.passengers = passengers;
        this.range = range;
    }

    public String getName(){return name;}

    public double getMaxSpeed(){return topSpeed;}

    public int getNoPassengers(){return passengers;}

    public double getRange(){return range;}

}
