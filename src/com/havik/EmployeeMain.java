package com.havik;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the address");
		String address = sc.nextLine();
		System.out.println("Enter mobile");
		String mobile = sc.nextLine();
		
		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpAddress(address);
		employee.setEmpMobile(mobile);
		
		System.out.println("Employee Details ");
		System.out.println("Name: "+employee.getEmpName());
		System.out.println("Address: "+employee.getEmpAddress());
		System.out.println("Mobile: "+employee.getEmpMobile());

	}

}
