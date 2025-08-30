package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    // TODO: Replace these lines with your tests
    @Test
    void testSingleRoman1(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("I", roman.convert(1));
    }
    @Test
    void testSingleRoman5(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("V", roman.convert(5));
    }
    @Test
    void testSingleRoman10(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("X", roman.convert(10));
    }
    @Test
    void testSubstractionRoman4(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("IV", roman.convert(4));
    }
    @Test
    void testSubstractionRoman9(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("IX", roman.convert(9));
    }
    @Test
    void testRoman40(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("XL", roman.convert(40));
    }
    @Test
    void testRoman50(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("L", roman.convert(50));
    }
    @Test
    void testRoman90(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("XC", roman.convert(90));
    }
    @Test
    void testRoman100(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("C", roman.convert(100));
    }
    @Test
    void testRoman400(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("CD", roman.convert(400));
    }
    @Test
    void testRoman500(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("D", roman.convert(500));
    }
    @Test
    void testRoman900(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("CM", roman.convert(900));
    }
    @Test
    void testRoman1000(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("M", roman.convert(1000));
    }
    @Test
    void testRoman1994(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals("MCMXCIV", roman.convert(1994));
    }

//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
