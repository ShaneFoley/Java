package org.example;




public class Main {
    public static void main(String[] args){
        /*
        System.out.println(Payroll.calculatePay(1, Payroll.PayLevel.ONE));

        System.out.println(Payroll.calculatePay(10, Payroll.PayLevel.TWO));

        System.out.println(Payroll.calculatePay(20, Payroll.PayLevel.THREE));

        System.out.println(Payroll.calculatePay(70, Payroll.PayLevel.TWO));

        try {
            System.out.println(Payroll.calculatePay(100, Payroll.PayLevel.TWO));
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }


        Payroll.REGULAR_WEEK = 20;
        System.out.println(Payroll.calculatePay(25, Payroll.PayLevel.TWO));


        //I'm cheating from here on
//constants should be final!
        Payroll.OVERTIME_RATE = 2;
        Payroll.REGULAR_WEEK = 40;
        System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.TWO));

        Payroll.OVERTIME_RATE = 1.75;
        Payroll.REGULAR_WEEK = 40;
        Payroll.LEVEL_ONE_PAY = 12;
        System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.ONE));

        Payroll.OVERTIME_RATE = 1.75;
        Payroll.REGULAR_WEEK = 25;
        Payroll.LEVEL_TWO_PAY = 30;
        System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.TWO));

        Payroll.OVERTIME_RATE = 1.75;
        Payroll.REGULAR_WEEK = 40;
        Payroll.LEVEL_THREE_PAY = 50;

        */



        Payroll.OVERTIME_RATE = 1.25;
        Payroll.REGULAR_WEEK = 55;
        Payroll.LEVEL_TWO_PAY = 40;
        PayClaim p = new PayClaim(70, Payroll.PayLevel.TWO);
        p.calculatePay();
        System.out.println(p);
    }




}