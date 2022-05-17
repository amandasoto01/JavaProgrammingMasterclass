package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        System.out.println("Busted min value = " +(myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue/2);

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myLong = 50000L + (10L*(myByte + myShort + myInt));

        System.out.println(myLong);

        short shortTotal = (short)(1000 + 10*(myByte+myShort+myInt));


    }
}
