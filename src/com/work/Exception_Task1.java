package com.work;
import java.io.*;
public class Exception_Task1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the total runs scored");
            int totalRuns = Integer.parseInt(br.readLine());

            System.out.println("Enter the total overs faced");
            int totalOvers = Integer.parseInt(br.readLine());

            double runRate = (double)totalRuns / totalOvers;
            System.out.println("Current Run Rate: " + String.format("%.2f", runRate));
        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	
	}
}
