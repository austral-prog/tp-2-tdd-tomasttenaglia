package com.tp2.leapyear;


public class LeapYear {

    public boolean isLeapYear(int year) {
        boolean isDivisibleByFour = year % 4 == 0;
        boolean isDivisibleByHundred = year % 100 != 0;
        boolean isDivisibleByFourHundred = year % 400 == 0;
        return (isDivisibleByFour && isDivisibleByHundred) || isDivisibleByFourHundred;
    }

    public boolean isDivisibleByFour(int year) {
        boolean isDivisibleByFour = year % 4 == 0;
        return isDivisibleByFour;
    }
    public boolean isDivisibleByHundred(int year) {
        boolean isDivisibleByHundred = year % 100 != 0;
        return isDivisibleByHundred;
    }
    public boolean isDivisibleByFourHundred(int year) {
        boolean isDivisibleByFourHundred = year % 400 == 0;
        return isDivisibleByFourHundred;
    }
}
