package com.company;

public class Room {

    private String name;
    private Library library;

    public Room(Library library, String name) {
        this.library = library;
        this.name = name;
    }

    public void getBooks(){
        System.out.println("You have "+library.getBooks()+" books");
    }
}
