package com.Comparable;

import java.time.format.DateTimeFormatter;
import java.util.*;

public class MatchSortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of matches:");
        int numMatches = scanner.nextInt();

        List<Match> matchList = new ArrayList<>();

        for (int i = 1; i <= numMatches; i++) {
            System.out.println("Enter match date in (MM-dd-yyyy):");
            String matchDate = scanner.next();

            System.out.println("Enter Team 1:");
            String teamOne = scanner.next();

            System.out.println("Enter Team 2:");
            String teamTwo = scanner.next();

            Match match = new Match(matchDate, teamOne, teamTwo);
            matchList.add(match);
        }

        Collections.sort(matchList);

        System.out.println("Match Details:");
        for (Match match : matchList) {
            System.out.println("Team 1: " + match.getTeamOne());
            System.out.println("Team 2: " + match.getTeamTwo());
            System.out.println("Match held on " + match.getMatchDate().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
        }

        scanner.close();
    }
}
