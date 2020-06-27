package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num){
        if(num < 1){
            return false;
        }
        int total=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                total+=i;
            }
        }
        if(total == num){
            return true;
        }else{
            return false;
        }

    }
}
