package com.company;

public class Main {

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(36);

        mercedes.steer(50);
        mercedes.accelerate(30);
        mercedes.accelerate(20);
        mercedes.accelerate(-42);
    }
}
