package com.company;

public class Library {

    private int shelves;
    private int doors;
    private int books;

    public Library(int shelves, int doors, int books){
        this.shelves = shelves;
        this.doors = doors;
        this.books = books;
    }

    public int getShelves() {
        return shelves;
    }

    public int getDoors() {
        return doors;
    }

    public int getBooks() {
        return books;
    }
}
