package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        String num = Integer.toString(number);

        return Character.getNumericValue((num.charAt(0))) + Character.getNumericValue(num.charAt(num.length() - 1));

    }
}
