package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Cinecolombia", 8, 12);

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        List<Theatre.Seat> reversedSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reversedSeats);
        printList(reversedSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        System.out.println("Price seats");
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.print(" "+seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=================================");
    }

}
