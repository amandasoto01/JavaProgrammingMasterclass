package com.company;

public class EvenDigitSum {

    public static int getEventDigitSum (int number){

        if(number < 0){
            return -1;
        }

        String num = Integer.toString(number);
        int total = 0;

        for(int i=0; i<num.length(); i++){
            int n = Character.getNumericValue(num.charAt(i));
            if(n % 2 == 0){
                total+= n;
            }
        }

        return total;
    }
}
