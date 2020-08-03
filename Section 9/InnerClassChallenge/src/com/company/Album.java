package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private SongList songs;

    public Album(String title) {
        this.title = title;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.addSong(new Song(title,duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playList.add((checkedSong));
            return true;
        }
        System.out.println("This album doesnt have the track: "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String name, LinkedList<Song> playList){
        Song song = this.songs.findSong(name);
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


    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean addSong(Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
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


        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if( index >= 0 && index<this.songs.size()){
                return this.songs.get(index);
            }
            return null;
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public void setSongs(ArrayList<Song> songs) {
            this.songs = songs;
        }
    }
}
