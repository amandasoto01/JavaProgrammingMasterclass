package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player som = new Player("som", 10, 10);
        System.out.println(som.toString());
        som.setHitPoints(20);
        som.setWeapon("dagger");
        saveObject(som);
       // loadObject(som);
        System.out.println(som.toString());

        ISaveable werewolf = new Monster("Werewolf", 20,25);
        System.out.println("Monster stregnth is "+ ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
        loadObject(werewolf);

        Monster demon = new Monster ("Demon", 30,30);
        System.out.println("Demon stregnth is "+demon.getStrength());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable object){
        for(int i=0; i<object.save().size(); i++){
            System.out.println("Saving "+object.save().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable object){
        ArrayList<String> values = readValues();
        object.read(values);
    }
}
