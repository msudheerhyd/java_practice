package com.practice.session17;

public class Session17Practice {
	
	public static void main(String[] args) {
		
		Lion lion1 = new Lion();
		lion1.animalMakingSound();
	}
}

// This is called Abstraction
abstract class Animal {
	
	public void animalMakingSound() {
		
		System.out.println("Animal is making sound");
	}
	
}

class Lion extends Animal {
	
	
}