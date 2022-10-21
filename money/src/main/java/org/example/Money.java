package org.example;

public class Money {

    private int wholeNumber;

    private int decimalPart;

    private boolean positive;

    private char currencySymbol;


    public String toString() {
        String s = "";
        String negative = "-";

        if (decimalPart < 10) {
            if (positive == true) {
                s = String.valueOf(currencySymbol) + wholeNumber + "." + "0" + decimalPart;
            } else s = negative + String.valueOf(currencySymbol) + wholeNumber + "." + "0" + decimalPart;
        } else {
            if (positive == true) {
                s = String.valueOf(currencySymbol) + wholeNumber + "." + decimalPart;
            } else s = negative + String.valueOf(currencySymbol) + wholeNumber + "." + decimalPart;
        }
        return s;
    }

    public boolean equals(Money obj) {
        boolean isEqual;

        if (this.positive == obj.positive && this.currencySymbol == obj.currencySymbol && this.wholeNumber == obj.wholeNumber && this.decimalPart == obj.decimalPart) {
            isEqual = true;
        } else isEqual = false;


        return isEqual;
    }


    public boolean greaterThan(Money obj) {
        boolean isGreater;

        if (this.positive == true && obj.positive == false) isGreater = true;
            else if (this.wholeNumber > obj.wholeNumber) isGreater = true;
                else if(this.decimalPart > obj.decimalPart) isGreater = true;

         else isGreater = false;

        return isGreater;
    }





    Money(int wholeNumber, int decimalPart1, boolean positive, char currencySymbol1) {

        if (wholeNumber < 0) throw new IllegalArgumentException("wholeNumber is not valid!");

        if (decimalPart < 0 || decimalPart > 99) throw new IllegalArgumentException("decimal is not valid!");


    }


    public int getWholeNumber() {

        return this.wholeNumber;
    }

    public int getDecimalPart() {

        return this.decimalPart;
    }


    public boolean isPositive() {

        return this.positive;
    }

    public char getCurrencySymbol() {
        return this.currencySymbol;
    }


    public void setWholeNumber(int newNum) {
        if (newNum < 0) throw new IllegalArgumentException("whole number is not valid!");
        else this.wholeNumber = newNum;
    }

    public void setDecimalPart(int newDec) {
        if (newDec < 0) throw new IllegalArgumentException("decimal is not valid!");
        else this.decimalPart = newDec;
    }

    public void setPositive(boolean newPos) {

        this.positive = newPos;
    }

    public void setCurrencySymbol(char i) {

        if (i == '$') this.currencySymbol = i;
        else if (i == '£') this.currencySymbol = i;
        else if (i == '€') this.currencySymbol = i;
        else throw new IllegalArgumentException("Currency invalid");

    }

}





