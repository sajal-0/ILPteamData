package com.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Players.Players;
import com.PlayersDau.IPLteams;

public class ServicePlayers {

    IPLteams s = new IPLteams();
    public List<Players> allBatters() {

        List<Players> allBatterList = new ArrayList<>();
        for(List<Players> list : s.teams){
            for(Players player : list){
                if(player.getRuns()>5000){
                    allBatterList.add(player);
                }
            }
        }
        return allBatterList;
    }

    //List of batters in RCB
    public List<Players> rcbBatters() {

        List<Players> rcbBatterList = new ArrayList<>();
        for (Players player : s.rcb) {
            if (player.getRuns() > 5000) {
                rcbBatterList.add(player);
            }
        }
        return rcbBatterList;
    }

//LIst of batters in MI
    public List<Players> miBatters() {

        List<Players> miBatterList = new ArrayList<>();
        for (Players player : s.mi) {
            if (player.getRuns() > 5000) {
                miBatterList.add(player);
            }
        }
        return miBatterList;
    }

    //List of batters in CSk
    public List<Players> cskBatters() {
        List<Players> cskBatterList = new ArrayList<>();
//		addPlayer();
        for (Players player : s.csk) {
            if (player.getRuns() > 5000) {
                cskBatterList.add(player);
            }
        }
        return cskBatterList;
    }
// LIst of all bowlers
    public List<Players> allBowlers() {
        List<Players> allBowlers = new ArrayList<>();
       for(List<Players> team : s.teams){
           for(Players player : team){
               if(player.getWickets()>50){
                   allBowlers.add(player);
               }
           }
       }
        return allBowlers;
    }

    //list of all bowlers of rcb

    public  List<Players>  bowlerrcb() {
        List<Players> bowlersRCB = new ArrayList<>();
        for (Players player : s.rcb) {
            if (player.getWickets() > 50) {
                bowlersRCB.add(player);
            }
        }
        return bowlersRCB;
    }

    //list of all bowlers of csk

    public List<Players> bowlercsk() {
        List<Players> bowlersCSK = new ArrayList<>();
        for (Players player : s.csk) {
            if (player.getWickets() > 50) {
                bowlersCSK.add(player);
            }
        }
        return bowlersCSK;
    }
//list of all bowlers of mi

    public List<Players> bowlermi() {
        List<Players> bowlersMI = new ArrayList<>();
        for (Players player : s.mi) {
            if (player.getWickets() > 50) {
                bowlersMI.add(player);
            }
        }
        return bowlersMI;
    }

    //List of all allrounder

    public List<Players> allRoundersAll() {
        List<Players> allRounders = new ArrayList<>();
       for(List<Players> team : s.teams){
           for(Players player : team){
               if(player.getWickets() > 50 && player.getRuns() > 5000){
                   allRounders.add(player);
               }
           }
       }
        return allRounders;
    }


    public List<Players> startsWith() {
        Scanner sc = new Scanner(System.in);
        List<Players> nameStartWith = new ArrayList<>();
        System.out.println("Enter the character : ");
        String ss = sc.next();
       for(List<Players> team : s.teams){
           for(Players player : team){
               String str = player.getName().trim(); // Get the trimmed name of the player
               char sub = str.charAt(0);

               if (ss.equalsIgnoreCase(Character.toString(sub))) {
                   nameStartWith.add(player); // Print player details if matched
               }
           }
       }
        return nameStartWith;
    }

    public List<Players> addPlayersRCB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to add players in the team ");
        int newPlayerNo = sc.nextInt();

        List<Players> newList = new ArrayList<>(s.rcb);

        for (int i = 0; i < newPlayerNo; i++) {
            System.out.println("Enter the player name : ");
            String name = sc.next();
            System.out.println("Enter the players jersey_No : ");
            int no = sc.nextInt();
            System.out.println("Enter the runs of players : ");
            int runs = sc.nextInt();
            System.out.println("Enter the wicket taken by the player : ");
            int wicket = sc.nextInt();
            System.out.println("Enter the team name : ");
            String team = sc.next();
            newList.add(new Players(name,no,runs,wicket,team));
        }
        return newList;

    }


}
