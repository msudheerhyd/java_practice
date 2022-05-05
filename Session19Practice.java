package com.practice.session19;

public class Session19Practice {
	
	public static void main(String[] args) {
		
		Lion lion1= new Lion();
		
		lion1.makeSound();
		lion1.eatingFood();
	}
}

abstract class Animal {
	
	public void makeSound() {
		
		System.out.println("Animal is making sound");
	}
	
	public abstract void eatingFood();
}

class Lion extends Animal {
	
	public void eatingFood() {
		
		System.out.println("Animal is eating food");
	}
}
