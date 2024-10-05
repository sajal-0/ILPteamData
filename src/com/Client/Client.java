package com.Client;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.Controller.Controller;
import com.Players.Players;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		Controller c = new Controller();

		//The Collections.sort() method is used to sort the elements of list
		//It takes two parameters: the list to be sorted and a Comparator that defines the sorting logic.
		//(p1,p2) -> This is lambda Expression(Comparator) p1 and p2 are two players object



		do{

			System.out.println("Available Options ");
			System.out.println("0 to Print allbatters\n" + "1 to Print all allrounders\n"
					+"2 to print allBowlers\n"
			+"3 to print all rcb batters\n" + "4 to print all mi batters\n" + "5 to print all csk batters\n"
			+"6 to print all rcb bowlers\n" + "7 to print all mi bowlers\n" + "8 to print all csk bowlers\n"
			+"9 to print name startwith players \n"+"10 to add players in rcb \n"+"EXIT!!!");

			int option = sc.nextInt();
			sc.nextLine();

			switch (option){
			case 0 :
				List<Players> list = c.allBattersInIPL();
				Collections.sort(list, (p1, p2) -> Integer.compare(p2.getRuns(), p1.getRuns()));

				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Players player : list) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
				}

				// Table Footer
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");

				break;
				case 1 :
					//List of all allrounders

					System.out.println("List Of all AllRounders In IPL :");
					List<Players> allrounders = c.allAllRounders();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : allrounders) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 2 :
					System.out.println("List Of all AllBowlers In IPL :");
					List<Players> allBowlers = c.allBowlersInIPL();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : allBowlers) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 3 :
					System.out.println("List Of  Batters in RCB :");
					List<Players> rcbbatters = c.rcbBatters();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : rcbbatters) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 4:
					System.out.println("List Of  Batters in MI :");
					List<Players> miBatters = c.miBatters();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : miBatters) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 5:
					System.out.println("List Of  Batters in CSK :");
					List<Players> cskBatters = c.cskBatters();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : cskBatters) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 6:
					System.out.println("List Of  Bowlers in RCB :");
					List<Players> rcbBowlers = c.rcbBowlers();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : rcbBowlers) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 7:
					System.out.println("List Of  Bowlers in MI :");
					List<Players> miBowlers = c.miBowlers();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : miBowlers) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;

				case 8:
					System.out.println("List Of  Bowlers in CSK :");
					List<Players> cskBowlers = c.cskBowlers();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : cskBowlers) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 9:
					System.out.println("List Of Name Start With :");
					List<Players> start = c.startsWithChar();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : start) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 10:
					System.out.println("Add Players In RCB : ");
					List<Players> add = c.addRCBPlayer();
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					for (Players player : add) {
						System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
								player.getName(), player.getJersey_No(), player.getRuns(), player.getWickets(), player.getTeam());
					}
					System.out.printf("+---------------------+-----------+-------+---------+------+\n");
					break;
				case 11:
					System.out.println("Exiting the application. Thank you!");
					System.exit(0); // Exit the program
					break;
				default:
					System.out.println("Invalid option. Please try again.");
					break;


			}

		}while (true);
	}
	
	
}
