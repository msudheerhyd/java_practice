package com.practice.session4;

import java.util.LinkedList;

public class Session4Practice {

	public static void main(String[] args) {
		
		LinkedList<String> myLinkedList = new LinkedList<String>();
		myLinkedList.add("Aeroplane");
		myLinkedList.add("IPhone");
		myLinkedList.add("OnePlus");
		myLinkedList.add("Samsung");
		
		System.out.println(myLinkedList);
		System.out.println("The first element is: " + myLinkedList.get(0));
		System.out.println("The first element is: " + myLinkedList.getFirst());
		System.out.println("The last element is: " + myLinkedList.getLast());
		
		
	}
}
