package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(NumberPalindrome.isPalindrome(-12521));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));

        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));

        System.out.println(EvenDigitSum.getEventDigitSum(123456789));
        System.out.println(EvenDigitSum.getEventDigitSum(252));
        System.out.println(EvenDigitSum.getEventDigitSum(-22));

        System.out.println();
        System.out.println(SharedDigit.hasSharedDigit(12,23));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(15,55));

        System.out.println();
        System.out.println(LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9,99,999));

        System.out.println();
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));

        System.out.println();
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);

        System.out.println();
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));

        System.out.println();
       NumberToWords.numberToWords(1234);
       NumberToWords.numberToWords(-12);
       NumberToWords.numberToWords(2);
       NumberToWords.numberToWords(-2);
       NumberToWords.numberToWords(1000);
       NumberToWords.numberToWords(-2);
    }
}
