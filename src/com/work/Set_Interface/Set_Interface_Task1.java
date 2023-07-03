package com.work.Set_Interface;
import java.util.*;
public class Set_Interface_Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of matches:");
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> players = new HashSet<>();

        System.out.println("Enter the players who have won the Player of the Match title:");
        for (int i = 0; i < n; i++) {
            players.add(scanner.nextLine());
        }

        int count = players.size();

        System.out.println(count);
	}

}
