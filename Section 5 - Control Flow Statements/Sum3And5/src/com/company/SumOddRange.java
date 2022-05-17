package com.company;

public class SumOddRange {

    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        }

        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int total = 0;

        if (end < start || start < 0 || end < 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    total += i;
                }
            }
            return total;
        }

    }
}
