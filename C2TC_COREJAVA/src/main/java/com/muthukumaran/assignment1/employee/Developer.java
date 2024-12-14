package com.muthukumaran.assignment1.employee;
import java.util.*;

public class Developer extends Employee{
	private String role;
	public Developer(int employeeId,String employeeName, double salary){
		super(employeeId, employeeName, salary);
		this.role = role;
		}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	}
