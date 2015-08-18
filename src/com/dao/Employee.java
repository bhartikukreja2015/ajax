package com.dao;




public class Employee {
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	private String firstName;
	private String lastName;
	private int empID;
	private double empSal;
	public Employee(String firstName, String lastName, int empID, double empSal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empID = empID;
		this.empSal = empSal;
	}
	
	
}
