package org.example;

public class Q1 {

        public Q1(){

        }

        public void printTriangle(int num, char letter ){
            String triangle ="";

            if(2 < num && num <= 10){
            for (int i = 0; i < num; i++) {
                triangle = triangle + letter + " ";
                System.out.println(triangle);
            }
            }else System.out.println("Not valid input");

        }
}

