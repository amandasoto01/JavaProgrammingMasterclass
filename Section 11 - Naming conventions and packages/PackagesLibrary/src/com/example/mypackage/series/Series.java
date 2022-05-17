package com.example.mypackage.series;

public class Series {

    public static int nSum(int num){
        int total=0;
        for(int i=0; i<=num; i++){
            total+=(i);
        }
        return total;
        //return (num*(num+1))/2;
    }

    public static int factorial (int n){
        int factorial=n;

        if(n==0){
            return 1;
        }

        for(int i=(n-1); i>0; i--){
            factorial *= i;
        }
        return factorial;
    }

    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }

        if(num==1){
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static long sequentialFibonacci (int num){
        if( num ==0){
            return 0;
        }

        if(num == 1){
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for(int i=1; i<num; i++){
            fib = (nMinus1 + nMinus2);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
