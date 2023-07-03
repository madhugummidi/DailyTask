package com.work.List;
import java.util.ArrayList;
import java.util.Scanner;
public class List_Interface_Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 System.out.println("Enter the player details");
	        System.out.println("Enter player name:");
	        String name = scanner.nextLine();
	        System.out.println("Enter age:");
	        int age = Integer.parseInt(scanner.nextLine());
	        System.out.println("Enter country:");
	        String country = scanner.nextLine();
	        
	        System.out.println("Player Details");
	        System.out.println(name);
	        System.out.println(age);
	        System.out.println(country);
	        
	        System.out.println("Enter Skill:");
	        String skill = scanner.nextLine();
	        System.out.println("Enter the position to add the skill:");
	        int position = Integer.parseInt(scanner.nextLine());
	        
	        ArrayList<String> playerDetails = new ArrayList<>();
	        playerDetails.add(name);
	        playerDetails.add(String.valueOf(age));
	        playerDetails.add(country);
	        
	        playerDetails.add(position, skill);
	        
	        System.out.println("Player Details");
	        for (String detail : playerDetails) {
	            System.out.println(detail);
	        }
	       
	        System.out.println("Enter the position of the detail to be removed:");
	        int removePosition = Integer.parseInt(scanner.nextLine());
	     
	        playerDetails.remove(removePosition);

	        System.out.println("Player Details");
	        for (String detail : playerDetails) {
	            System.out.println(detail);
	        }
        }

	}


