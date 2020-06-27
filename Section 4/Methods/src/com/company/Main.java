package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Amanda", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Amanda", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Amanda", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Amanda", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Amanda", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Amanda", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Amanda", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
       /* if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;*/

        int position = 4; // assume position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        int j = 0;
        return position;
    }

    public static int calculateScore(boolean gameOver, int score,
                                     int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
