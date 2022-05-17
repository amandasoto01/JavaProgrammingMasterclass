package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Numbers ");
        int cant = scanner.nextInt();
        int [] array = new int[cant];
        array = numberArray(cant);
        printArray(array);
        System.out.println("Minimim value " + findMin(array));
        reverse(array);
        System.out.println("Reverse Array");
        printArray(array);
    }

    public static void reverse(int[]array){
        int i,j,aux;
        for(i=0, j=array.length-1; i<array.length/2; i++,j--){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
        }
    }
    public static int findMin(int[]array){
        if(array.length == 0){
            return 0;
        }
        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static void printArray(int[] array){
        System.out.print("Array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] numberArray(int cant){
        int[] array = new int[cant];
        for(int i=0; i<cant; i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
}
