package com.practice.session13;

public class Session13Practice {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle(1234, "Honda");
		Car car1 = new Car(2345, "Toyota", 4);
		
		System.out.println(vehicle1);
		System.out.println(car1);
		
		vehicle1.isVehicleRunning();
		car1.isVehicleRunning();
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
	
	public void isVehicleRunning() {
		
		System.out.println("Vehicle is running");
	}
	
	public String toString() {
		
		return "Vehicle number is: " + this.vehicleNo + "Vehicle name is " + this.vehicleName; 
	}
}

class Car extends Vehicle {
	
	int tyres;
	
	public Car(int num, String name, int noOfTyres) {
		
		this.vehicleNo = num;
		this.vehicleName = name;
		this.tyres = noOfTyres;
	}
	
	@Override
	public void isVehicleRunning() {
		
		System.out.println("Car is running");
	}
	
	public String toString() {
		
		return "Car number is: " + this.vehicleNo + "Car name is : " + this.vehicleName + "No. of tyres are: " + this.tyres;
	}
}
