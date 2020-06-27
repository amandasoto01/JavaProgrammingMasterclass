package com.company;

public class Main {

    public static void main(String[] args) {

        /*Player player = new Player();
        player.name = "tim";
        /player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        */

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("tim", 200 , "Sword");
        System.out.println("Initial health is "+ enhancedPlayer.getHitPoints());
    }
}
