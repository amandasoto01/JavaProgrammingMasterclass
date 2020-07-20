package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)!=null){
            return false;
        }
        System.out.println(title);
        this.songs.add(new Song(title,duration));
        return true;
    }

    private Song findSong(String title){
        for(int i=0; i<this.songs.size(); i++){
            if(this.songs.get(i).getTitle().equals(title)){
                return this.songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        int index = trackNumber-1;
        if((index>=0) &&  (index<=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesnt have the track: "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String name, LinkedList<Song> playList){
        Song song = findSong(name);
        if(song == null){
            System.out.println("This album doesnt have the song: "+name);
            return false;
        }

        playList.add(song);
        return true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
