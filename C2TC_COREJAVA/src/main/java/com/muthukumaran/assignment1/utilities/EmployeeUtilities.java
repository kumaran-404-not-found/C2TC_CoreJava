package com.muthukumaran.assignment1.utilities;

import com.muthukumaran.assignment1.employee.*;

public class EmployeeUtilities {
	public void printEmployeeDetails(Employee employee) {
		System.out.println("Name: " + employee.getEmployeeName());
		System.out.println("ID: " + employee.getEmployeeId());
		System.out.println("Salary: " + employee.getSalary());
	}
}
