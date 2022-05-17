package com.company;

import java.sql.SQLOutput;

public class NumberPalindrome {

    public static boolean isPalindrome(int num) {
        int n = Math.abs(num);
        int tam = String.valueOf(n).length();
        int max = 0;
        String number = Integer.toString(n);


        boolean band = false;
        if (tam % 2 == 0) {
            band = true;
            max = (tam / 2) - 1;
        } else {
            max = tam / 2;
        }

        int i, j;

        for (i = 0, j = tam - 1; i <= max; i++, j--) {

            if (number.charAt(i) != number.charAt(j)) {
                return false;
            }

            if (band && (i + 1 == j - 1)) {
                return true;
            }

            if (!band && (i == j)) {
                return true;
            }

        }

        return true;
    }
}
