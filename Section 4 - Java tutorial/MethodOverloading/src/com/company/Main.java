package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Amanda", 500);
        System.out.println("New score is " + newScore);
        calculateScore(100);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6, -1);

        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(-10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    //****//

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double feetCentimeters = (feet * 12) * 2.54;
        feetCentimeters += (inches * 2.54);
        System.out.println(feet + " Feet " + inches + " inches = " + feetCentimeters + " cm");
        return feetCentimeters;
    }

    //1 inch = 2.54cm
    //1 foot = 12 inches
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }
        double feet = (int)inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}
