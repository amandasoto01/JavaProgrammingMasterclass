package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[25];//= {1,2,3,4,5,6,7,8,9,10};
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
       printArray(sorted);
        //System.out.println("The average is "+getAverage(myIntegers));

    }
    public static double getAverage(int[] array){
       double total=0;
        for(int i=0; i<array.length;i++){
            total += array[i];
        }
        return total/(double)array.length;
    }

    public static int[] sortIntegers(int[] array){
        int aux=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[i]>array[j]){
                    System.out.println(array[i] + " j: "+array[j]);
                  aux=array[i];
                  array[i]=array[j];
                  array[j]=aux;
                }
                printArray(array);
            }
        }
        return array;
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+ " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Elemente: "+ i + ", value is "+array[i]
                    +" ");
        }
    }
    public static int[] sortArrray(int[]array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i]=array[i];
        }
        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] <sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
