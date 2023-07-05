package com.Comparable;

import java.util.*;

public class RankingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the number of players");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        List<Ranking> players = new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Enter the name of player " + i);
            String name = scanner.nextLine();
            System.out.println("Enter the score of player " + i);
            long score = scanner.nextLong();
            scanner.nextLine();

            players.add(new Ranking(name, score));
        }

        Collections.sort(players);

        System.out.println("Player Details by Score (High to Low)");
        for (int i = 1; i <= players.size(); i++) {
            Ranking player = players.get(i);
            System.out.println(i + " " + player.getName() + " " + player.getScore());
        }

        scanner.close();
    }
}

