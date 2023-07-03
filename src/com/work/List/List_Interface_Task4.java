package com.work.List;
import java.util.*;
public class List_Interface_Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of matches Gayle had played:");
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> scores = new ArrayList<>();

        System.out.println("Enter the scores of Gayle in each match:");
        for (int i = 0; i < n; i++) {
            scores.add(Integer.parseInt(scanner.nextLine()));
        }

        int fiftyCount = 0;
        int hundredCount = 0;

        for (int score : scores) {
            if (score >= 50 && score < 100) {
                fiftyCount++;
            } else if (score >= 100) {
                hundredCount++;
            }
        }

        System.out.println(fiftyCount);
        System.out.println(hundredCount);

	}

}
