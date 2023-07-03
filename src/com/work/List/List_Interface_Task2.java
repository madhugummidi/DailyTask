package com.work.List;
import java.util.*;
public class List_Interface_Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        List<String> teamRankings = new ArrayList<>();

        System.out.println("Enter the names of the top 5 teams of IPL season 13:");
        for (int i = 0; i < 5; i++) {
            teamRankings.add(scanner.nextLine());
        }
        
        System.out.println("Current Team Rankings:");
        for (String team : teamRankings) {
            System.out.println(team);
        }

        System.out.println("Enter swap positions:");
        int swapPosition1 = Integer.parseInt(scanner.nextLine()) - 1;
        int swapPosition2 = Integer.parseInt(scanner.nextLine()) - 1;

        Collections.swap(teamRankings, swapPosition1, swapPosition2);

        System.out.println("Predicted Team Rankings:");
        for (String team : teamRankings) {
            System.out.println(team);
        }
	}

}
