package com.practice.session12;

public class Session12Practice {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle(3312, "Ciaz");
		Car car1 = new Car(1234, "Skoda", 4);
		
		System.out.println(vehicle1);
		System.out.println(car1);
	}
}

class Vehicle {
	
	int vehicleNo;
	String vehicleName;
	
	public Vehicle(int num, String name) {
		
		this.vehicleNo = num;
		this.vehicleName = name;
	}
	
	public Vehicle() {
		
		
	}
	
	public String toString() {
		
		return "Vehicle number is : " + this.vehicleNo + " " + "Vehicle name is : " + this.vehicleName;
	}
	
}

//Inheritance
class Car extends Vehicle {
	
	int tyres;
	
	public Car (int num, String name, int noOfTyres){
		
		this.vehicleNo = num;
		this.vehicleName = name;
		this.tyres = noOfTyres;
	}
	
	public String toString() {
		
		return "Car number is: " +this.vehicleNo + " " + "Car name is : " + this.vehicleName + "No. of tyres is : "
				+ this.tyres;
	}
}
