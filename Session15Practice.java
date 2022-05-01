package com.practice.session15;

public class Session15Practice {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1435, "Kathik", "Reddy");
		Employee employee2 = new Employee(1534, "Nikhil", "Varma");
		
		
		
		employee1.printSomething();
		
		Class2 play = new Class2();
		
		play.printSomething();
		
	}
}

class Class2 extends Employee {
	
	@Override
	public void printSomething() {
		
		super.printSomething();
		System.out.println("This is from class2");
	}
	
}


class Employee {
	
	int employeeId;
	String fName;
	String lName;
	
	public Employee(int empId, String fName, String lName) {
		
		this.employeeId = empId;
		this.fName = fName;
		this.lName = lName;
		
	}
	
	public void printSomething() {
		
		System.out.println("This is Bond");
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Employee() {
		
		
	}
	
	public String toString() {
		
		return "Employee id is: " +employeeId + " " + "Employee's first name is: " +fName + " "
				+ "Employee's last name is: " +lName;
	}
}
