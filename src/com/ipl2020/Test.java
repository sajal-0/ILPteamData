package com.ipl2020;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		IPLteams t = new IPLteams();
		
		
		System.out.println("List of all players(batters)");
		t.batterAlL();
		
		System.out.println("List Of all Batter in RCB :");
		t.batterrcb();
		
		System.out.println("List Of all Batter in CSK :");
		t.battercsk();
		
		System.out.println("List Of all Batter in MI :");
		t.battermi();
		
		
		System.out.println("Bowlers with more than 50 wickets:");
		t.bowlerAll();
		
		System.out.println("List of all bowler in RCB : ");
		t.bowlerrcb();
		
		
		System.out.println("List Of All Allrounnders in IPL : ");
		t.allRoundersAll();
		
		t.startsWith();
	}
	
	
}
