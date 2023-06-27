package com.work;
import java.util.*;
class InvalidLoginException extends Exception
{
	InvalidLoginException()
	{
		System.out.println("Invalid username or password");
	}
}
public class ExceptionHandling {
	public static void main(String[] args) throws InvalidLoginException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if(username=="admin"&&password=="admin123")
		{
			System.out.println("Login Successful");
		}
		else
		{
			throw new InvalidLoginException();
		}
	}
}
