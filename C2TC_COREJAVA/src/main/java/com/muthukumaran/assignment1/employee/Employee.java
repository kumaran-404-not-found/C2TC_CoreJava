package com.muthukumaran.assignment1.employee;
import java.util.*;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Date dob; 
	private double salary;
	private int experience;
	
public Employee(int employeeId, String employeeName, double salary) {
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.dob = dob;
	this.salary = salary;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

}