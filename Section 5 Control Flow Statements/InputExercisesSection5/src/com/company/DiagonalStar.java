package com.company;

public class DiagonalStar {
    public static void printSqueareStar(int num){
        if(num < 5){
            System.out.println("Invalid Value");
        }else{


            for(int i=0; i<num; i++){
              //  System.out.println(i);
                for(int j=0; j<num; j++){
                   // System.out.println((i+1)+" i "+ i + " j "+j+" num "+(num-j+1));
                    if( i==0 || i==(num-1) || j==0 || j==(num-1)){
                        System.out.print("*");
                    }else if(i==j){
                        System.out.print("*");
                    }else if(j+1 == (num-i)){
                        System.out.print("*");
                    }else{
                       // System.out.println();
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
