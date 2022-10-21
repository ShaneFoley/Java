package org.example;

public class Plane implements Vehicle{

    String name;
    int topSpeed;
    int passengers;
    String destination;

    Plane(String name, int topSpeed, int passengers, String destination ){
        if (name == " ") throw new IllegalArgumentException("plane NEEDS NAME");
        if (topSpeed < 0) throw new IllegalArgumentException("Cannot have negative val for topspeed");
        if (passengers > 900 || passengers < 0) throw new IllegalArgumentException("No more passenger");
        if (destination == " ") throw new IllegalArgumentException("no not enough");
        this.name = name;
        this.topSpeed = topSpeed;
        this.passengers = passengers;
        this.destination = destination;
    }

    public String getName(){return name;}

    public double getMaxSpeed(){return topSpeed;}

    public int getNoPassengers(){return passengers;}

    public String getDestination(){return destination;}
}
