package com.practice.session27;

public class Abstraction {
	
	public static void main(String[] args) {
		Lion lion1 = new Lion();
		lion1.makesSound();
		lion1.typeOfSound();
		
		Car car1 = new Car();
		car1.printNoOfTyres();
		car1.printVehicleCompany();
	}
}

class Car implements Vehicle {

	@Override
	public void printNoOfTyres() {
		
		System.out.println("Four");
		
	}

	@Override
	public void printVehicleCompany() {
		
		System.out.println("Jaguar");
		
	}
}

interface Vehicle {
	
	public void printNoOfTyres();
	
	public void printVehicleCompany();
}

abstract class Animal {
	
	public void makesSound() {
		
		System.out.println("Making sound");
	}
	
	public abstract void typeOfSound();
}

class Lion extends Animal {

	@Override
	public void typeOfSound() {
		
		System.out.println("Roar");
	}
}
