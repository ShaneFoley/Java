package org.example;

public class Time {

    public int hours;
    public int minutes;
    public int seconds;


    public void printTime() {

        /*int hours = 2;
        int seconds= 3;
        int minutes =23;*/
        String zero ="0";

        System.out.print("[");
        if(hours<10)System.out.print(zero +hours + ":");
        else System.out.print(hours + ":");
        if(minutes<10)System.out.print(zero +minutes + ":");
        else System.out.print(minutes + ":");
        if(seconds<10)System.out.print(zero +seconds + "]");
        else System.out.print(seconds + "]");


    }

}


