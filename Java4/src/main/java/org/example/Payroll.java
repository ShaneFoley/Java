package org.example;



public class Payroll {
    public static double OVERTIME_RATE = 1.5;
    public static int REGULAR_WEEK = 40;
    public static int LEVEL_ONE_PAY = 15;
    public static int LEVEL_TWO_PAY = 25;
    public static int LEVEL_THREE_PAY = 40;
    enum PayLevel{ONE, TWO, THREE};


    public static double calculatePay(int noHoursWorked, PayLevel e){

        if (noHoursWorked > 80 || noHoursWorked < 0) throw new IllegalArgumentException("noHoursWorked is not valid!");

        int payRate = 0;
        double regularHours = 0;
        double overtimeHours = 0;
        double totalPay = 0;

        switch (e) {
            case ONE:  payRate = LEVEL_ONE_PAY;
            break;
            case TWO: payRate = LEVEL_TWO_PAY;
            break;
            case THREE: payRate = LEVEL_THREE_PAY;
            break;
        }

        double overtimeRate = payRate * OVERTIME_RATE;

        if(noHoursWorked > REGULAR_WEEK){
            regularHours = REGULAR_WEEK;
            overtimeHours = noHoursWorked - REGULAR_WEEK;
            totalPay = payRate*regularHours + ((overtimeHours*payRate)*OVERTIME_RATE);

            }
        else{
            totalPay = noHoursWorked*payRate;
            }

     return totalPay;
    }

}