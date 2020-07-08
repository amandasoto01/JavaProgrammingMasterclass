package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1234");

    public static void main(String[] args) {
        boolean quit = false;
        int option = 0 ;

        while(!quit) {
            System.out.println("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    mobilePhone.listOfContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }

    public static void printInstruction(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add a new contact to the list");
        System.out.println("\t 3 - To modify a contact in the list");
        System.out.println("\t 4 - To remove a contact from the list");
        System.out.println("\t 5 - To search for a contact in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addContact(){
        System.out.println("Please enter the name of the new contact: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the number of the new contact: ");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        mobilePhone.store(contact);
    }

    public static void  modifyContact(){
        System.out.println("Please enter the name of the contact: ");
        String name = scanner.nextLine();
        //System.out.println("Please enter the number of the contact: ");
        //String number = scanner.nextLine();
        //Contact previusContact = new Contact(name, number);
        Contact existingContact = mobilePhone.searchContact(name);

        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Please enter the new name of the contact: ");
        name = scanner.nextLine();
        System.out.println("Please enter the new number modified of the contact: ");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name, number);
        mobilePhone.modify(existingContact,newContact);
    }

    public static void removeContact(){
        System.out.println("Please enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the number of the contact: ");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        mobilePhone.removeContact(contact);
    }

    public static void searchForContact(){
        System.out.println("Please enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the number of the contact: ");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        if(mobilePhone.searchContact(contact)){
            System.out.println("Found "+contact.getName()+" in your contacts list");
        }else{
            System.out.println(contact.getName() + " is not in the contacts list");
        }
    }


}
