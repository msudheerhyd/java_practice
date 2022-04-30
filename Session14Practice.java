package com.practice.session14;

public class Session14Practice {
	
	public static void main(String[] args) {
		 
		Person person1 = new Person("Sudheer", "Mocharla", 1996);
		Person person2 = new Person("Sunil", "Mocharla", 1991);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person1.getAge());
		System.out.println(person1.getfName());
		System.out.println(person1.getlName());
		System.out.println(person1.getYearOfBirth());
		System.out.println("====================================");
		
		System.out.println(person2.fName);
		System.out.println(person2.getAge());
		
		person1.setfName("Ramana");
		System.out.println(person1);
		
	}
}

class Person {
	
	String fName;
	String lName;
	int yearOfBirth;
	int age;
	
	public Person(String first, String last, int birthYear) {
		
		this.fName = first;
		this.lName = last;
		this.yearOfBirth = birthYear;
	}
	
	public Person() {
		
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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getAge() {
		this.age = 2022 - this.yearOfBirth;
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String toString() {
		 
		return "Person's first name is: " +this.fName + " " + "Person's last name is: " +this.lName + " "
				+ "Year of Birth is : " +this.yearOfBirth + "Age is : " + this.getAge();
	}
}
