package com.work.List;
import java.util.*;
public class List_Interface_Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        List<String> topScorersSeason13 = new ArrayList<>();
        List<String> topScorersSeason12 = new ArrayList<>();

        System.out.println("Enter the top 5 scorers of IPL Season 13:");
        for (int i = 0; i < 5; i++) {
            topScorersSeason13.add(scanner.nextLine());
        }

       
        System.out.println("Enter the top 5 scorers of IPL Season 12:");
        for (int i = 0; i < 5; i++) {
            topScorersSeason12.add(scanner.nextLine());
        }

        Set<String> commonPlayers = new HashSet<>(topScorersSeason13);

        commonPlayers.retainAll(topScorersSeason12);

        System.out.println("Consistent run scorers:");
        for (String player : commonPlayers) {
            System.out.println(player);
        }

	}

}
