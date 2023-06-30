package com.work;
import java.util.*;
class TeamNameNotFoundException extends Exception
{
	TeamNameNotFoundException()
	{
	System.out.println("Entered team is not a part of IPL Season 13");
	}
}

public class Exception_Task4 {
	public static void main(String[] args) {
		
	
	String[] names = {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab",
		    "Kolkata Knight Riders",
		    "Mumbai Indians",
		    "Rajasthan Royals",
		    "Royal Challengers Bangalore"};
	try {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the expected winner team of IPL Season 13");
	String winnerTeam = sc.nextLine();

	System.out.println("Enter the expected runner team of IPL Season 13");
	String runnerTeam = sc.nextLine();
	
	boolean containsName = false;
	boolean containsName1 = false;
	
	for (String name : names) {
	    if (name.equals(winnerTeam)) {
	        containsName = true;
	        break;
	    }
	}
	for (String name : names) {
	    if (name.equals(runnerTeam)) {
	        containsName1 = true;
	        break;
	    }
	}
	if(containsName&&containsName1)
	{
		System.out.println("Expected IPL Season 13 winner: " + winnerTeam);
	    System.out.println("Expected IPL Season 13 runner: " + runnerTeam);
	}
	else
	{
		throw new TeamNameNotFoundException();
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}

	
