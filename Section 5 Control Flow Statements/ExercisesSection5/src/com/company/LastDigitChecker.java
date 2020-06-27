package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c){

        if(a < 10 || a > 1000 ||b < 10 || b > 1000 || c < 10 || c > 1000 ){
            return false;
        }

        String num = Integer.toString(a);
        String num2 = Integer.toString(b);
        String num3 = Integer.toString(c);

        if(num.charAt(num.length()-1) == num2.charAt(num2.length()-1)){
            return true;
        }else if(num.charAt(num.length()-1) == num3.charAt(num3.length()-1)){
            return true;
        }else if(num2.charAt(num2.length()-1) == num3.charAt(num3.length()-1)){
            return true;
        }
        return false;
    }

    public static boolean isValid(int num){
        if (num < 10 || num > 1000){
            return false;
        }
        return true;
    }
}
