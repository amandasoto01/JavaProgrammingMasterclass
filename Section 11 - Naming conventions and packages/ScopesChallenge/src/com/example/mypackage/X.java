package com.example.mypackage;

import java.util.Scanner;

public class X {

    private int x;

    public X(Scanner x){
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void x(){
        for(int x=1; x<=12; x++){
            System.out.println(this.x*x);
        }
    }
}
