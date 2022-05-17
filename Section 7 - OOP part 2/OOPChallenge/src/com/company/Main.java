package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseBurger baseBurger = new BaseBurger("normal","meat",15,"Normal");
        System.out.println(baseBurger.getTotalPrice());
        baseBurger.setAddition1("tomatos",4d);
        baseBurger.setAddition2("onions", 6.6d);
        System.out.println("Total price of the burger is " + baseBurger.getTotalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.setAddition1("Egg ",5.43);
        System.out.println("First addition " +healthyBurger.getTotalPrice());
        healthyBurger.setHealthAdditon1(new Addition("Lemitils",3.41));
        System.out.println("Second addition "+healthyBurger.getTotalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getTotalPrice());
    }
}
