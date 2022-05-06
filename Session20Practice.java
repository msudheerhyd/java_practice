package com.practice.session20;

public class Session20Practice {
	
	public static void main(String[] args) {
		
		Lion lion1 = new Lion();
		
		lion1.animalIsEating();
		lion1.animalIsSleeping();
	}
}

interface Animal {
	
	public void animalIsSleeping();
	
	public void animalIsEating();
}

class Lion implements Animal {
	
	public void animalIsSleeping() {
		
		System.out.println("Lion is sleeping");
	}
	
	public void animalIsEating() {
		
		System.out.println("Lion is eating");
	}
}