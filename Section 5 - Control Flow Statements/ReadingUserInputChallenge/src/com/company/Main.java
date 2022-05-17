package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cont=0, total=0;

        while(true) {
            int order = cont + 1;
            System.out.println("Enter number #" + order + ": ");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                cont++;
                total+=number;

                if (cont == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //handle end of line (enter key)
        }
        System.out.println("sum "+total);
        scanner.close();
    }
}
