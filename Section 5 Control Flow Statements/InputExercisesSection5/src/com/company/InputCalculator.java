package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double total=0;
        double nums=0;

        while(true){

            boolean hasInt = scanner.hasNextInt();

            if(hasInt){
                int number = scanner.nextInt();
                total+=number;
                nums++;
            }else{
                break;
            }
            scanner.nextLine();//handle end of line(enter key)
        }


        System.out.println("SUM = " + (int)total + " AVG = "+ (long)Math.ceil((total/nums)));
        scanner.close();
    }
}
