package com.company;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        contacts = new ArrayList<>();
    }

    public boolean store(Contact contact){
        if(posContact(contact.getName()) >=0){
            System.out.println("The contact already exists");
            return false;
        }
        this.contacts.add(contact);
        return true;
    }

    public boolean modify(Contact previousContact, Contact newContact){
        int pos = posContact(previousContact);
        if(pos < 0){
            System.out.println(previousContact.getName() + " was not found");
           return false;
        }else if(posContact(newContact.getName()) != -1){
            System.out.println("Contact " + newContact.getName() +
                    " already exists. Update was not successful");
            return false;
        }

        this.contacts.set(pos, newContact);
        System.out.println(previousContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    private int posContact(String name){
        int i = 0;
        for (Contact c: contacts) {
            if(c.getName().equals(name)){
                return i;
            }
            i++;
        }
        return -1;
        //return this.contacts.indexOf(contact);
    }

    private int posContact(Contact contact){
        int i = 0;
        for (Contact c: contacts) {
            if(c.getName().equals(contact.getName()) && c.getNumber().equals(contact.getNumber())){
                return i;
            }
            i++;
        }
        return -1;
        //return this.contacts.indexOf(contact);
    }
    /*private int posContact(Contact contact){
        return this.contacts.indexOf(contact);
    }*/

    public boolean searchContact(Contact contact){
        int pos = posContact(contact);
        if(pos >=0){
            return true;
        }
        return false;
    }

    public Contact searchContact(String name){
        int pos = posContact(name);
        if(pos>=0){
            return this.contacts.get(pos);
        }
        return null;
    }

    public boolean removeContact(Contact contact){
        int pos = posContact(contact);
        if(pos < 0){
            return false;
        }
        contacts.remove(pos);
        //contacts.remove(contact);
        return true;
    }

    public void listOfContacts(){

        for(int i=0; i<contacts.size(); i++){
            System.out.println(i+1 + " Name: "+contacts.get(i).getName() +" Number:"
            +contacts.get(i).getNumber());
        }
    }
}
