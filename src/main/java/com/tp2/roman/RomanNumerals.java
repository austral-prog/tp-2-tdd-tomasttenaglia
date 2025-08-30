package com.tp2.roman;

public class RomanNumerals {

    public String convert(int number) {
        String result = "";
        if (number <= 0 || number >= 3999) {
            return "Número Romano Invalido";
        }
        int[] Numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] Romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < Numbers.length; i++) {
            while(number >= Numbers[i]) {
                result += Romans[i];
                number -= Numbers[i];
            }
        }
        return result;
    }
}
