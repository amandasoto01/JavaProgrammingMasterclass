package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeagueTable <T extends Team> {

    private String name;
    private List<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println(team + " already in the league");
            return false;
        }
        teams.add(team);
        return true;
    }

    public void printTeams (){
        //usee de compare to in the team class
        Collections.sort(teams);
        for (T team: teams) {
            System.out.println(team.getName() + ": "+team.ranking());
        }
    }

}
