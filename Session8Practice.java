package com.practice.session8;

public class Session8Practice {
	
	public static void main(String[] args) {
		
		Vehicle car = new Vehicle();
		car.name = "BMW";
		car.noOfTyres = 4;
		System.out.println(car.name  + " " + car.noOfTyres);
		
		Vehicle lorry = new Vehicle();
		lorry.name = "Eicher";
		lorry.noOfTyres = 6;
		System.out.println(lorry.name + " " + lorry.noOfTyres);
		
		Vehicle auto = new Vehicle();
		auto.name = "Piaggio";
		auto.noOfTyres = 3;
		System.out.println(auto.name + " " + auto.noOfTyres);
		
		Vehicle bike = new Vehicle();
		bike.name = "Gixer";
		bike.noOfTyres = 2;
		System.out.println(bike.name + " " + bike.noOfTyres);
	}

}

class Vehicle {
	
	String name;
	int noOfTyres;
}