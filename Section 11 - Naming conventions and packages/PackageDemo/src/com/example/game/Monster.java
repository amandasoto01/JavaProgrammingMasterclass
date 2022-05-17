package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strenght=" + strength +
                '}';
    }


    @Override
    public List<String> save() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, ""+this.hitPoints);
        values.add(2,"" +this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedObjects) {
        if(savedObjects != null && savedObjects.size() >0){
            this.name = savedObjects.get(0);
            this.hitPoints = Integer.parseInt(savedObjects.get(1));
            this.strength = Integer.parseInt(savedObjects.get(2));
        }
    }
}
