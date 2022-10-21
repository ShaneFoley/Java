package org.example;

public class Q2 {

    public Q2(){

    }

    public void printString(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            counter++;
        }
        System.out.println(str);
        System.out.println("Contains " + counter + " characters");
    }

    }

