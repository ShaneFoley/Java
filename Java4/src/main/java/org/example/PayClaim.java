package org.example;

public class PayClaim {
    int noHoursWorked;
    Payroll.PayLevel payLevel;
    double calculatedPay;
    String s;
    int paySet=0;
    // constructors
    PayClaim(int noHoursWorked, Payroll.PayLevel payLevel){
        if (noHoursWorked > 80) throw new IllegalArgumentException("Too many hours , take break");
        if (noHoursWorked < 0) throw new IllegalArgumentException("Too many hours , take break");

        this.noHoursWorked = noHoursWorked;
        this.payLevel = payLevel;
    }


    // accessors or getters
    public double getCalculatedPay(){
        return this.calculatedPay;
    }

    public Payroll.PayLevel getPayLevel(){
        return this.payLevel;
    }

    public int getNoHoursWorked(){
        return this.noHoursWorked;
    }

    public void setCalculatedPay(double calculatedPay){
        paySet =1;
        if (calculatedPay < 0) throw new IllegalArgumentException("pay is not valid!");
        this.calculatedPay = calculatedPay;
    }

    public String toString(){

        if(noHoursWorked ==1){
            if (paySet == 1) s = "PayClaim for " + noHoursWorked + " hour, at Paylevel " + payLevel + ", which gives " + calculatedPay;
            else s = "PayClaim for "  + noHoursWorked + " hour, at PayLevel " + payLevel;

        }else{
            if (paySet == 1) s = "PayClaim for " + noHoursWorked + " hours, at Paylevel " + payLevel + ", which gives " + calculatedPay;
            else s = "PayClaim for " + noHoursWorked + " hours, at PayLevel " + payLevel;
        }
        return s;
    }

    public double calculatePay(){
       this.calculatedPay = Payroll.calculatePay(noHoursWorked, payLevel);
       setCalculatedPay(this.calculatedPay);
        return calculatedPay;
    }



}
