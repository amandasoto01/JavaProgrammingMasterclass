package com.company;

public class LargestPrime {

    public static int getLargestPrime(int num){
        boolean band = true;

        if(num<=1){
            return -1;
        }
        int largest = 0;


        for(int j=2; j<=num; j++){

            for(int i=2; i<j; i++){
                if(j%i==0){
                    band=false;
                }
            }

            if(band && num%j == 0){
                largest = j;
            }
            band=true;
        }

        return largest;
    }
}
