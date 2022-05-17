package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int a, int b){

        if( a < 10 || b < 10){
            return -1;
        }

        int menor;
        if(a<b){
            menor = a;
        }else{
            menor = b;
        }

        int divisor = 0;
        for(int i=1; i<=menor; i++){
            if( a%i ==0 && b%i==0){
                divisor = i;
            }
        }

        return divisor;
    }
}
