package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

        System.out.println("----OUR GENERIC CLASS-----");


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer david = new SoccerPlayer("David");

        Team<FootballPlayer> team = new Team<>("Team");
        team.addPlayer(joe);
        //team.addPlayer(pat);
        //team.addPlayer(david);

        System.out.println(team.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("BaseballTeam");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(david);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer player = new FootballPlayer("Gordon");
        melbourne.addPlayer(player);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(team,3,8);

        team.matchResult(fremantle,2,1);
        //it must be the same type of the team
        //team.matchResult(baseballTeam,1,1);

        System.out.println("Rankings");
        System.out.println(team.getName() + ": "+team.ranking());
        System.out.println(melbourne.getName() + ": "+melbourne.ranking());
        System.out.println(fremantle.getName()+ ": "  + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": "+hawthorn.ranking());
        System.out.println(team.compareTo(melbourne));
        System.out.println(team.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(team));
        System.out.println(melbourne.compareTo(fremantle));


        System.out.println("--------CHALLENGE--------------");

        LeagueTable<Team<FootballPlayer>> footballPlayerLeagueTable = new LeagueTable<>("AFL");

        footballPlayerLeagueTable.addTeam(team);
        footballPlayerLeagueTable.addTeam(melbourne);
        footballPlayerLeagueTable.addTeam(hawthorn);
        footballPlayerLeagueTable.addTeam(fremantle);

        footballPlayerLeagueTable.printTeams();


    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(int i : items){
            System.out.println( i * 2);
        }
    }
}
