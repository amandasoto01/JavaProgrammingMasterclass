package com.company;

import com.sun.source.tree.NewArrayTree;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else if(score < 500){
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got here");
        }*/

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        /*boolean newGameover = true;
        int secondScore = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        if (newGameover) {
            int finalScore = secondScore + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore);
        }*/


        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
