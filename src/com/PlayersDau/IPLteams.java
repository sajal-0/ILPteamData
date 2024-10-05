package com.PlayersDau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Players.Players;

public class IPLteams {

Scanner sc= new Scanner(System.in);
	public List<List<Players>> teams = new ArrayList<>();
	public List<Players> rcb = new ArrayList<>();
	public List<Players> csk = new ArrayList<>();
	public List<Players> mi = new ArrayList<>();

	  

	
	public List<List<Players>> getAllPLayers() {

		teams.add(rcb);
		teams.add(mi);
		teams.add(csk);
//		List<Players> allPlayers = new ArrayList<>();

		rcb.add(new Players("Virat Kohli", 18 , 11000, 4, "RCB"));
		rcb.add(new Players("AB de Villiers", 17, 10000, 59, "RCB"));
		rcb.add(new Players("Faf du Plessis", 19 , 8000, 5, "RCB"));
		rcb.add(new Players("Mohammed Siraj", 13 , 900, 229, "RCB"));
		rcb.add(new Players("Yuzvendra Chahal", 03, 650, 289, "RCB"));
		rcb.add(new Players("Glenn Maxwell", 32, 7000, 60, "RCB"));
		rcb.add(new Players("Harshal Patel", 24 ,1500, 100, "RCB"));
		rcb.add(new Players("Wanindu Hasaranga",99, 1200, 150, "RCB"));

		csk.add(new Players("MS Dhoni",07, 7000, 7, "CSK"));
		csk.add(new Players("Ravindra Jadeja",8, 5001, 150, "CSK"));
		csk.add(new Players("Ruturaj Gaikwad",31, 10000, 29, "CSK"));
		csk.add(new Players("Moeen Ali",18, 7000, 75, "CSK"));
		csk.add(new Players("Deepak Chahar",90, 800, 65, "CSK"));
		csk.add(new Players("Dwayne Bravo",47, 2000, 170, "CSK"));
		csk.add(new Players("Ambati Rayudu", 9, 6000, 8, "CSK"));
		csk.add(new Players("Devon Conway", 88, 3500, 12, "CSK"));

		mi.add(new Players("Rohit Sharma",45, 9000, 15, "MI"));
		mi.add(new Players("Jasprit Bumrah", 93, 600, 200, "MI"));
		mi.add(new Players("Suryakumar Yadav",63, 8000, 51, "MI"));
		mi.add(new Players("Ishan Kishan",23, 7000, 18, "MI"));
		mi.add(new Players("Kieron Pollard", 55, 10000, 25, "MI"));
		mi.add(new Players("Hardik Pandya",33, 5500, 55, "MI"));
		mi.add(new Players("Trent Boult",18, 1100, 150, "MI"));
		mi.add(new Players("Rahul Chahar",28 , 800, 90, "MI"));
		return teams;
	}



	
	public IPLteams() {
		getAllPLayers();
	}
//	public List<Players> allBatters() {
//
//		List<Players> allBatterList = new ArrayList<>();
//		for (Players player : rcb) {
//			if (player.getRuns() > 5000) {
//				allBatterList.add(player);
//			}
//		}
//		for (Players player : csk) {
//			if (player.getRuns() > 5000) {
//				allBatterList.add(player);
//			}
//		}
//		for (Players player : mi) {
//			if (player.getRuns() > 5000) {
//				allBatterList.add(player);
//			}
//		}
//
//		return allBatterList;
//	}

	








}
