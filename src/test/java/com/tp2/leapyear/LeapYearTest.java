package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void testIsDivisibleByFour() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isDivisibleByFour(2024));
    }
    @Test
    public void testIsDivisibleByHundred() {
        LeapYear leapYear = new LeapYear();
        assertFalse(leapYear.isDivisibleByHundred(1900));
    }
    @Test
    public void testIsDivisibleByFourHundred() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isDivisibleByFourHundred(1600));
    }
    @Test
    public void testisLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2024));
    }
}
