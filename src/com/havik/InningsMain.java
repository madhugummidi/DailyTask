package com.havik;
import java.util.*;
public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name");
		String teamname = sc.nextLine();
		System.out.println("Enter Session");
		String session = sc.nextLine();
		System.out.println("Enter runs");
		int runs = sc.nextInt();
		
		Innings innings = new Innings();
		innings.setTeamname(teamname);
		innings.setInningsname(session);
		innings.setRuns(runs);
		
		innings.displayInningsDetails();
	}

}
