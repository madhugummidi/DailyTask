package com.work.Crud;
import java.util.*;
public class CRUD {
	public static void main(String[] args) {
		Employee e1 = new Employee("Madhu","ameerpet","hyd");
		Employee e2 = new Employee("Madhu1","ameerpet1","hyd1");
		Employee e3 = new Employee("Madhu2","ameerpet2","hyd2");
		
		Map<Integer,Employee> m = new HashMap<Integer,Employee>();
		m.put(101, e1);
		m.put(102, e2);
		m.put(103, e3);
		
		System.out.println("1. read an Employee");
		System.out.println("2. create an Employee");
		System.out.println("3. update an Employee");
		System.out.println("4. delete an Employee");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
		{
			System.out.println("read an employee");
			System.out.println("Which record you are going to read");
			int record = sc.nextInt();
			Employee e = m.get(record);
			System.out.println(e);
			break;
		}
		case 2:
		{
			System.out.println("create an employee");
			System.out.println("Enter the new record");
			int record = sc.nextInt();
			System.out.println("Enter name of employee");
			String name1 = sc.next();
			System.out.println("Enter address1 of employee");
			String add1 = sc.next();
			System.out.println("Enter address2 of employee ");
			String add2 = sc.next();
			Employee e4 = new Employee(name1,add1,add2);
			m.put(record, e4);
			System.out.println(m);
			break;
		}
		case 3:
		{
			System.out.println("update an employee");
			System.out.println("Enter the record to update");
			int record1 = sc.nextInt();
			System.out.println("Enter name of employee");
			String name1 = sc.next();
			System.out.println("Enter address1 of employee");
			String addr1 = sc.next();
			System.out.println("Enter address2 of employee ");
			String addr2 = sc.next();
			Employee e5 = new Employee(name1,addr1,addr2);
			m.replace(record1, e5);
			System.out.println(m);
			break;
		}
		case 4:
		{
			System.out.println("delete an employee");
			System.out.println("Enter record to delete");
			int record = sc.nextInt();
			m.remove(record);
			System.out.println(m);
			break;
		}
		default:
		{
			System.out.println("Your option is not found");
		}
		}
		
	}
}
