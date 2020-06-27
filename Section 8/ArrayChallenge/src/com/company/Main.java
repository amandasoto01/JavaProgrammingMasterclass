package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myValue = 10;
        int anotherValue = myValue;
        System.out.println("value: "+myValue);
        System.out.println("anotherValue: " + anotherValue);
        anotherValue++;
        System.out.println("value: "+myValue);
        System.out.println("anotherValue: " + anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myInArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myInArray = "+ Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = "+Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("After modify myInArray = "+ Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray = "+Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0]=2;
        array = new int[]{1,2,3,4,5};
    }
}
