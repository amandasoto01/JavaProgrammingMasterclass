package com.company;

public class Sum3And5 {

    public static void sum (){
        int total = 0;
        int cont = 0;
        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                total += i;
                cont++;
            }
            if (cont == 5) {
                System.out.println("total = " + total);
                break;
            }
        }
    }
}
