package com.company;

public class Fish extends Animal{

    private int fills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int fills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.fills = fills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
