package com.ipl2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPLteams {

	
	
	List<Players> rcb = new ArrayList<>();
	List<Players> csk = new ArrayList<>();
	  List<Players> mi = new ArrayList<>();
	  
	  Scanner sc = new Scanner(System.in);
	
	public void addPlayer() {
		
	
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
		
	}
	
	public IPLteams() {
	    addPlayer(); // This will ensure players are added to all teams once an instance is created
	}
	
	public void batterAlL() {
		
		

		int n = sc.nextInt();
		for (Players player : rcb) {
            if (player.getRuns() > n) {
                System.out.println(player);
            }
        }
		for (Players player : csk) {
            if (player.getRuns() > n) {
                System.out.println(player);
            }
        }
		for (Players player : mi) {
            if (player.getRuns() > n) {
                System.out.println(player);
            }
        }
		
	}
	
	public void batterrcb() {
//		addPlayer();
		
		for (Players player : rcb) {
            if (player.getRuns() > 5000) {
                System.out.println(player);
            }
        }
		System.out.println();
	}
	public void battermi() {
//		addPlayer();
		for (Players player : mi) {
            if (player.getRuns() > 5000) {
                System.out.println(player);
            }
        }
		System.out.println();
	}
	public void battercsk() {
//		addPlayer();
		for (Players player : csk) {
	        if (player.getRuns() > 5000) {
	            System.out.println(player);
	        }
	    }
		System.out.println();
	}
	
	 public void bowlerAll() {

	        for (Players player : rcb) {
	            if (player.getWickets() > 50) {
	                System.out.println(player);
	            }
	        }
	        for (Players player : csk) {
	            if (player.getWickets() > 50) {
	                System.out.println(player);
	            }
	        }
	        for (Players player : mi) {
	            if (player.getWickets() > 50) {
	                System.out.println(player);
	            }
	        }
	    }
	 
	 public void bowlerrcb() {
		 for (Players player : rcb) {
	            if (player.getWickets() > 50) {
	                System.out.println(player);
	            }
	        }
	 }
	 public void bowlercsk() {
		 for (Players player : csk) {
	            if (player.getWickets() > 50) {
	                System.out.println(player);
	            }
	        }
		 System.out.println();
	 }
	 public void bowlermi() {
		 for (Players player : mi) {
	            if (player.getWickets() > 50) {
	                System.out.println(player);
	            }
	        }
		 System.out.println();
	 }
	 
	 public void allRoundersAll() {
		 for (Players player : rcb) {
	            if (player.getWickets() > 50 && player.getRuns() > 5000) {
	                System.out.println(player);
	            }
	        }
	        for (Players player : csk) {
	            if (player.getWickets() > 50 && player.getRuns() > 5000) {
	                System.out.println(player);
	            }
	        }
	        for (Players player : mi) {
	            if (player.getWickets() > 50 && player.getRuns() > 5000) {
	                System.out.println(player);
	            }
	        }
	 }
	 
	 public void startsWith() {
		 String s = sc.next();
		 for(Players player: rcb) {
			 String str = player.getName().trim(); // Get the trimmed name of the player
		     char sub = str.charAt(0);
			
		     if (s.equalsIgnoreCase(Character.toString(sub))) {
		            System.out.println(player); // Print player details if matched
		        }
			 
		 }
		 for(Players player: mi) {
			 String str = player.getName().trim(); 
		     char sub = str.charAt(0);
			
		     if (s.equalsIgnoreCase(Character.toString(sub))) {
		            System.out.println(player); 
		        }
			 
		 }
		 for(Players player: csk) {
			 String str = player.getName().trim(); 
		     char sub = str.charAt(0);
			
		     if (s.equalsIgnoreCase(Character.toString(sub))) {
		            System.out.println(player); 
		        }
			 
		 }
	 }
	
	
}
