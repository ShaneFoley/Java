package org.example;

public class Main {

    public static void main(String[] args) {

        Money m1 = new Money(1, 1, true, '€');
        Money m2 = new Money(200, 10, true, '$');
        System.out.println(m2.greaterThan(m1));
    }
}