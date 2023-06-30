package com.work;
import java.util.Scanner;
public class Exception_Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number of overs");
            int numberOfOvers = sc.nextInt();

            if (numberOfOvers <= 0) {
                throw new NegativeArraySizeException();
            }

            int[] runsPerOver = new int[numberOfOvers];

            System.out.println("Enter the number of runs for each over");
            for (int i = 0; i < numberOfOvers; i++) {
                runsPerOver[i] = sc.nextInt();
            }

            System.out.println("Enter the over number");
            int overNumber = sc.nextInt();

            if (overNumber < 1 || overNumber > numberOfOvers)
            {
                throw new ArrayIndexOutOfBoundsException();
            }

            int runsInOver = runsPerOver[overNumber - 1];
            System.out.println("Runs scored in this over: " + runsInOver);
        }
        catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        } 

	}

}
