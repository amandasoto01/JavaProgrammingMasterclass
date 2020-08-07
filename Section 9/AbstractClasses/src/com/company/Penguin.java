package com.company;

public class Penguin extends Bird {

    public Penguin (String name){
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Im not very good at that, can i go for a swim isntead?");
    }


}
