package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Youngblood");

        album.addSong("youngblood",3.23);
        album.addSong("want you back", 2.53);
        album.addSong("lie to me",2.30);
        album.addSong("valentine",3.16);
        album.addSong("talk fast", 3.07);
        album.addSong("moving along", 3.17);
        album.addSong("if walls could talk",3.02);

        albums.add(album);

        album = new Album("5 seconds of summer");
        album.addSong("she looks so perfect",3.22);
        album.addSong("dont stop", 2.49);
        album.addSong("good girls",3.27);
        album.addSong("kiss me kiss me",3.23);
        album.addSong("18", 3.09);
        album.addSong("everything i didnt say", 3.0);
        album.addSong("beside you",3.40);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addToPlayList("lie to me", playlist);
        albums.get(0).addToPlayList("talk fast", playlist);
        albums.get(0).addToPlayList("talk", playlist);
        albums.get(0).addToPlayList(7, playlist);

        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(20, playlist);
        albums.get(1).addToPlayList(7, playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> list){

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = list.listIterator();

        if(list.size()==0){
            System.out.println("No songs in the palylist");
        }else{
          //  System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    System.out.println("PlayList complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We reach the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }

                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward= true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward =false;
                        }else{

                            System.out.println("We're at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We're at the end of the list");
                        }
                    }
                    break;
                case 4:
                    if(list.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if ( listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                case 5:
                    printList(list);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - To quit\n" +
                "1 - To play next song\n" +
                "2 - To play previous song\n"  +
                "3 - To replay the current song\n" +
                "4 - Remove current song\n" +
                "5 - List songs in the playList\n" +
                "6 - Print available options");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------------");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------");
    }
}
