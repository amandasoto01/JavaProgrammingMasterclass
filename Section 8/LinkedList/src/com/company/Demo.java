package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder("Colombia",placesToVisit);
        addInOrder("Canada",placesToVisit);
        addInOrder("Australia",placesToVisit);
        addInOrder("Mexico",placesToVisit);
        addInOrder("Alemania",placesToVisit);
        addInOrder("Italia",placesToVisit);
        addInOrder("Argentina",placesToVisit);
        addInOrder("Alice Springs",placesToVisit);
        addInOrder("Canada",placesToVisit);

        printList(placesToVisit);

        /*placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);*/

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> list){
        Iterator<String> i = list.iterator();

        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination ");
                return false;
            }else if(comparison > 0){
                //newCity should appear before this one
                //example Brisbane - > adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }

        System.out.println("Now visiting "+listIterator.next());
        printMenu();
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting "+listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previus city");
        System.out.println("3 - print menu");
    }
}
