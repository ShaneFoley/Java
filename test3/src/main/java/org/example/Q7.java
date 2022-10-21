package org.example;

public class Q7 {



    public String reverseChangeCase(String s){

        String reversed="";
        char ch;

         for (int i=0; i<s.length(); i++)
         {
         ch= s.charAt(i);
             reversed= ch+reversed;
         }
         reversed = reversed.toUpperCase();
        System.out.println(reversed);
        return reversed;
}
}
