package com.Controller;

import java.util.ArrayList;
import java.util.List;

import com.Players.Players;
import com.Service.ServicePlayers;

public class Controller {

    ServicePlayers a = new ServicePlayers();

    public List<Players> allBattersInIPL(){
        List<Players> batters =  a.allBatters();
        List<Players> list = new ArrayList<>(batters);
        return list;
    }

    public List<Players> rcbBatters(){
        List<Players> batters = a.rcbBatters();
        List<Players> list = new ArrayList<>(batters);
        return list;
    }

    public List<Players> miBatters(){
        List<Players> batters = a.miBatters();
        List<Players> list = new ArrayList<>(batters);
        return list;
    }
    public List<Players> cskBatters(){
        List<Players> batters = a.cskBatters();
        List<Players> list = new ArrayList<>(batters);
        return list;
    }

    public List<Players> allBowlersInIPL(){
        List<Players> bowlers = a.allBowlers();
        List<Players> list = new ArrayList<>(bowlers);
        return list;
    }

    public List<Players> rcbBowlers(){
        List<Players> bowlers = a.bowlerrcb();
        List<Players> list = new ArrayList<>(bowlers);
        return list;
    }
    public List<Players> cskBowlers(){
        List<Players> bowlers = a.bowlercsk();
        List<Players> list = new ArrayList<>(bowlers);
        return list;
    }
    public List<Players> miBowlers(){
        List<Players> bowlers = a.bowlermi();
        List<Players> list = new ArrayList<>(bowlers);
        return list;
    }

    public List<Players> allAllRounders(){
        List<Players>  allrounders= a.allRoundersAll();
        List<Players> list = new ArrayList<>(allrounders);
        return list;
    }
    // print the list of players that name start with given input char
    public List<Players> startsWithChar(){
        List<Players> start = a.startsWith();
        List<Players> list = new ArrayList<>(start);
        return list;
    }

    public List<Players> addRCBPlayer(){
        List<Players> rcb = a.addPlayersRCB();
        List<Players> list = new ArrayList<>(rcb);
        return list;
    }

}
