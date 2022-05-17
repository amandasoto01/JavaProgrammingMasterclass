package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(1345));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int num){
        int n=num;
        int total=0;

        if(num<10){
            return -1;
        }

        while(n>0){

            total += n%10;
            n/=10;
        }
        return total;
    }
}
