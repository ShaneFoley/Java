package org.example;
import java.util.ArrayList;

public class Main {


    static void printVehicles(ArrayList<Vehicle> array){

        for(int i = 0; i < array.size(); i++){
            if ( array.get(i) instanceof EV){ System.out.println("This EV has a range of " + ((EV) array.get(i)).getRange() + " kms" );}
            if ( array.get(i) instanceof Plane){ System.out.println("This plane is travelling to " + ((Plane) array.get(i)).getDestination());}
        }
    }
    public static void main(String[] args) {


        /*
        Vehicle vehicles[] = new Vehicle[5];

        Plane p = new Plane("Airbus", 900, 500, "Sydney");
        vehicles[0] = p;

        EV ev = new EV("Leaf", 200, 5, 260);
        vehicles[1] = ev;

        Plane spitfire = new Plane("Spitfire", 2500, 5, "Area 51");
        vehicles[2] = spitfire;

        Plane boeing = new Plane("Boeing", 850, 400, "Hong Kong");
        vehicles[3] = boeing;

        EV rivian = new EV("Rivian RT1", 190, 5, 400);
        vehicles[4] = rivian;

        System.out.println(vehicles.length);

        for(int i = 0; i < vehicles.length; i++){
            System.out.println(vehicles[i].getName() + " - " + vehicles[i].getMaxSpeed() + " - " + vehicles[i].getNoPassengers());
        }

        System.out.println(((Plane)vehicles[0]).getDestination());
        System.out.println(((EV)vehicles[1]).getRange());
        System.out.println(((Plane)vehicles[2]).getDestination());
        System.out.println(((Plane)vehicles[3]).getDestination());
        System.out.println(((EV)vehicles[4]).getRange());

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new EV("Nissan Leaf", 190,5,260));
        vehicles.add(new EV("Tesla Model 3", 210,5,350));
        vehicles.add(new Plane("Airbus 360", 950,500, "New York"));
        vehicles.add(new EV("Mini E", 200,4,210));
        vehicles.add(new Plane("Boeing 747", 850,300, "Toronto"));
        System.out.println(Vehicle.biggestVehicle(vehicles));


         */

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new EV("Nissan Leaf", 190,5,280));
        vehicles.add(new EV("Tesla Model 3", 210,5,370));
        vehicles.add(new Plane("Concord", 1050, 200, "Paris"));
        vehicles.add(new EV("Mini E", 200,4,210));
        vehicles.add(new Plane("Boeing 747", 850,300, "Chicago"));
        printVehicles(vehicles);

    }


}