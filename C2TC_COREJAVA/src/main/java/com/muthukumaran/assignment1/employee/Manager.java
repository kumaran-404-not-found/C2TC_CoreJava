package com.muthukumaran.assignment1.employee;

import java.util.Date;

public class Manager extends Employee{
	private String department;
	public Manager(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);
		// TODO Auto-generated constructor stub
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
