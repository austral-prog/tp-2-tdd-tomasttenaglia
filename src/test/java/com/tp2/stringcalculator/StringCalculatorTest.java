package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    // TODO: Replace these lines with your tests
    @Test
    public void testEmptyString() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0,stringCalculator.calculator(""));
    }
    @Test
    public void singleNumber() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1,stringCalculator.calculator("1"));
    }
    @Test
    public void twoNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3,stringCalculator.calculator("1,2"));
    }
    @Test
    public void multipleNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.calculator("1,2,3"));
    }
    @Test
    public void saltoDeLinea() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.calculator("1\n2,3"));
    }
    @Test
    public void negativeError() {
        StringCalculator stringCalculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.calculator("1,-2"));    }

//    Missing tests:
//
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
