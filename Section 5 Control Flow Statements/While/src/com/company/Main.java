package com.company;

public class Main {

    public static void main(String[] args) {
        int cont = 1;

        while (cont != 6) {
            System.out.println("The cont value is " + cont);
            cont++;
        }

        /*for(cont=1; cont != 6; cont++){
            System.out.println("Cont is "+ cont);
        }*/

        /*cont = 1;
        while (true) {
            if (cont == 6) {
                break;
            }
            System.out.println("The cont value is " + cont);
            cont++;
        }*/

        /*cont = 6;
        do {
            System.out.println("Cont value was " + cont);
            cont++;
            if (cont > 100) {
                break;
            }
        } while (cont != 6);*/

        int num = 4;
        int finished = 20;
        int total = 0;

        while(num <= finished){
            num++;
            if(!isEvenNumber(num)){
                continue;
            }
            System.out.println("Even number "+num);
            total++;
            if(total >= 5){
                break;
            }

        }
        System.out.println("Total even numbers found "+total);

    }

    public static boolean isEvenNumber(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
