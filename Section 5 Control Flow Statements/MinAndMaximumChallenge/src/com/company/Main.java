package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=9999, max=-1;

	    while(true){

            System.out.println("Enter a number");

            boolean band = scanner.hasNextInt();

            if (band){
                int num = scanner.nextInt();
                if(num<min){
                    min=num;
                }
                if(num>max){
                    max=num;
                }
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min "+min+ " Max: "+max);
        scanner.close();
    }
}
