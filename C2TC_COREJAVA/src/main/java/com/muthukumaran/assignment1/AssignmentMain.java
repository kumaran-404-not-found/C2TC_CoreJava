package com.muthukumaran.assignment1;

import com.muthukumaran.assignment1.employee.*;
import com.muthukumaran.assignment1.utilities.*;

public class AssignmentMain {
	public static void main(String [] args) {
		
		Manager manager = new Manager(1 ,"Kumaran", 125000.0);
		Employee employee = new Employee(2 ,"Rahul", 25000.0);
		
		EmployeeUtilities utility = new EmployeeUtilities();
		utility.printEmployeeDetails(manager);
		utility.printEmployeeDetails(employee);
	}
}
