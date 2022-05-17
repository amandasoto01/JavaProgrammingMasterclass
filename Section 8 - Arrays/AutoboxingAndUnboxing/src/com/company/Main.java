package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        //Autoboxing and unboxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<=10; i++){
            System.out.println(i + " - " + intArrayList.get(i).intValue());
        }

        //Example
        Integer myIntValue = 56; //java does the Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double i= 0.0; i<=10.0; i++ ){
            myDoubleValues.add(i);
        }

        for(int i=0; i<myDoubleValues.size(); i++){
            System.out.println(i + " - " + myDoubleValues.get(i));
        }

        System.out.println("************Challenge*********************");

        //Autoboxing and Unboxing challenge
        Bank bank = new Bank("Bancolombia");
        bank.addNewBranch("Rama");
        bank.addBranchCustomer("Rama","Som", 100.06);
        bank.addBranchCustomer("Rama","Manchas", 66.06);
        bank.addBranchCustomer("Rama","Moto", 66.06);

        bank.addNewBranch("Ramita");
        bank.addBranchCustomer("Ramita", "Thor", 125.09);

        bank.addCustomerTransaction("Rama","Som", 245.55);
        bank.addCustomerTransaction("Rama","Manchas", 25.55);
        bank.addCustomerTransaction("Rama","Som", 24.55);

        //bank.customersList("Rama",false);
        //bank.customersList("Rama",true);
        //bank.customersList("Ramita",true);

        bank.addNewBranch("Melbourne");
        if(!bank.addBranchCustomer("Melbourne", "Brian", 5.43)){
            System.out.println("Error Melbourne branch does not exists");
        }

        if(!bank.addNewBranch("Rama")){
            System.out.println("Rama Branch already exists");
        }

        if(!bank.addCustomerTransaction("Ramita", "Baguera", 56.63)){
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addBranchCustomer("Rama","Som", 12.21)){
            System.out.println("Customer already exists");
        }

    }
}
