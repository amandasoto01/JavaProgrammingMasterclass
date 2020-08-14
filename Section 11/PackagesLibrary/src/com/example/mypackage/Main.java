package com.example.mypackage;

import com.example.mypackage.series.Series;

public class Main {

    public static void main(String[] args) {

        Series series = new Series();

        System.out.println(series.nSum(0));
        System.out.println(series.nSum(1));
        System.out.println(series.nSum(3));

        System.out.println(series.fibonacci(2));
        System.out.println(series.sequentialFibonacci(2));
        System.out.println(series.fibonacci(5));
        System.out.println(series.sequentialFibonacci(5));

        System.out.println(series.factorial(5));
        System.out.println(series.factorial(0));
    }
}
