package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || b < 10 || a > 99 || b > 99) {
            return false;
        }

        String num = Integer.toString(a);
        String num2 = Integer.toString(b);

        for (int i = 0; i < num.length(); i++) {

            for (int j = 0; j < num2.length(); j++) {
                if (num.charAt(i) == num2.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }
}
