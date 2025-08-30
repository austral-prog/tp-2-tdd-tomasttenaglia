package com.tp2.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int calculator(String numbers) {
        int suma = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.length() == 1) {
            int converted_string = Integer.parseInt(numbers);
            return converted_string;
        }
        String[] converted_numbers = numbers.split("[,\n]");
        for (String p : converted_numbers) {
            if (Integer.parseInt(p) < 0) {
                throw new IllegalArgumentException();
            }
            suma += Integer.parseInt(p);
        }
        return suma;
    }
}