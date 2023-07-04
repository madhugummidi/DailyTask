package com.work.Crud;

public class Employee {
	 private String empname;
	 private String empaddress1;
	 private String empaddress2;
	public Employee(String empname, String empaddress1, String empaddress2) {
		super();
		this.empname = empname;
		this.empaddress1 = empaddress1;
		this.empaddress2 = empaddress2;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress1() {
		return empaddress1;
	}
	public void setEmpaddress1(String empaddress1) {
		this.empaddress1 = empaddress1;
	}
	public String getEmpaddress2() {
		return empaddress2;
	}
	public void setEmpaddress2(String empaddress2) {
		this.empaddress2 = empaddress2;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empaddress1=" + empaddress1 + ", empaddress2=" + empaddress2 + "]";
	}
	 
}
