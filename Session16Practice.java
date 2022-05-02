package com.practice.session16;

public class Session16Practice {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle(4563, "Mercedes");
		
		vehicle1.someMethod();
		vehicle1.someMethod(564);
		vehicle1.someMethod(768, "Jaguar");
	}
} 

//Polymorphism (Polymorphism is Method Overloading and Method Overriding)
//Inheritence (Child class inheriting the variable and methods of parent class) 
//Encapsulation (Getters and Setters : Binding the variables to a class and not providing direct access)

class Vehicle {
	
	int vehicleNo;
	String vehicleName;
	
	public void someMethod() {
		
		System.out.println("Vehicle is running");
	}
	
	//Method Overloading
	public void someMethod(int i) {
		
		System.out.println("i is " +i);
	}
	
	//Method Overloading
	public void someMethod(int i, String name) {
		
		System.out.println("i is " +i + "String is: " +name);
	}
	
	public Vehicle(int vehicleNo, String vehicleName) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
	}
	
	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vehicle name is:" +this.vehicleName + " " + "Vehicle number is: " +this.vehicleNo;
	}
}

