package com.practice.session9.java;

public class Session9Practice {
	
	public static void main(String[] args) {
		
		Student student1  = new Student();
		student1.studentId = 4567;
		student1.name = "Ajay";
		
		Student student2 = new Student();
		student2.studentId = 2345;
		student2.name = "Sidharth";
		
		System.out.println(student1);
		System.out.println(student2);
	}
}
class Student {
	int studentId;
	String name;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student id is: " + studentId + ", Student name is: " + name;
	}
}