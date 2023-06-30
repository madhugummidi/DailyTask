package com.work;
import java.util.Scanner;
class InvalidAgeRangeException extends Exception {
    InvalidAgeRangeException() {
        System.out.println("InvalidAgeRangeException: Player's age should be 19 and above.");
    }
}

public class Exception_Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the player name");
            String playerName = scanner.nextLine();

            System.out.println("Enter the player age");
            int playerAge = scanner.nextInt();

            if (playerAge < 19) {
                throw new InvalidAgeRangeException();
            }

            System.out.println("Player name: " + playerName);
            System.out.println("Player age: " + playerAge);
        }
         catch(InvalidAgeRangeException e)
         {
        	 e.printStackTrace();
         }

	}

}
