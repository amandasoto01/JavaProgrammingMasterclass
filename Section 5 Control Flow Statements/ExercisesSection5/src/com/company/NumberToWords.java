package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class NumberToWords {

    public static int reverse ( int num){
        String number = Integer.toString(num);
        String revers="";

        for(int i= (number.length()-1); i>=0; i--){
            revers += number.charAt(i);
        }

        return Integer.parseInt(revers);
    }

    public static int getDigitCount(int num){
        if(num < 0){
            return -1;
        }

        if(Integer.toString(num).length() == 2){
            if(Integer.toString(num).charAt(0) == '-'){
                return 1;
            }
        }
        return Integer.toString(num).length();
    }

    public static void numberToWords (int num){
        int n;// = num%10;
        String numString = Integer.toString(num);
        int tam = numString.length();
        int inicio=10;

        if(getDigitCount(num) >= 1 ){
            num = reverse(num);

            for(int i=0; i<tam && num != 0; i++){
                //System.out.println(num%10);
                n=num%10;
                switch(n) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.print("Invalid number ");
                        break;

                }

                num/=10;

            }
            if(tam > Integer.toString(num).length()){
                for(int j=0; j<tam-1; j++){
                    System.out.print("Zero ");
                }
            }
            System.out.println();
        }else{
            System.out.println("Invalid Value");
        }

    }


}
