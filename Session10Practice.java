package com.practice.session10;

public class Session10Practice {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.employeeId = 12345;
		employee1.firstName = "Sudheer";
		employee1.lastName = "Mocharla";
		
		Employee employee2 = new Employee();
		employee2.employeeId = 12346;
		employee2.firstName = "Sunil";
		employee2.lastName = "Mocharla";
		
		Employee employee3 = new Employee();
		employee3.employeeId = 12347;
		employee3.firstName = "Prashanth";
		employee3.lastName = "Jajjari";
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		Employee employee4 = new Employee(7813, "Ajay", "Reddy");
		System.out.println(employee4);
	}
}

class Employee {
	
	int employeeId;
	String firstName;
	String lastName;
	
	public Employee(int id, String fName, String lName) {
		
		this.employeeId = id;
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public Employee() {
		
	}
	
	public String toString() {
		return "Employee id is" + employeeId + ", Employee's name is: " +firstName + " " + lastName;
	}
}
 
