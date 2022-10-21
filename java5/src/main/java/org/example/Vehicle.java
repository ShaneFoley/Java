package org.example;

import java.util.ArrayList;

public interface Vehicle {

    public String getName();
    public double getMaxSpeed();
    public int getNoPassengers();

    static String biggestVehicle(ArrayList<Vehicle> array){
        String biggest;
        int indexOfBiggest = 0;



        for(int i = 0; i < array.size(); i++){
            int temp = array.get(i).getNoPassengers();
            if( array.get(i).getNoPassengers() > array.get(indexOfBiggest).getNoPassengers()){
                indexOfBiggest = i;
            }
        }
        biggest = array.get(indexOfBiggest).getName();

        return biggest;

    }

}
