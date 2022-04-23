package com.practice.session7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Session7Practice {
	
	public static void printStringArray(String[] str) {
		
		System.out.println("The elememts in the array are: ");
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i] + ", ");
		}
		System.out.println();
	}
	
	public static void printStringList(List<String> booksList) {
		
		System.out.println("The books list is: ");
		for (int i=0; i<booksList.size(); i++) {
			System.out.print(booksList.get(i) + ", ");
		}
		System.out.println();	
	}
	
	
	public static void main(String[] args) {
		String[] str1 = {"Music", "Dance", "Gym", "Fifa", "Sleep"}; 
		printStringArray(str1);
		
		List<String> myList = new ArrayList<String>();
		myList.add("Buddha and his Dhamma");
		myList.add("Social Studies");
		myList.add("Science");
		myList.add("Java");
		myList.add("Python");
		printStringList(myList);
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "Dress");
		myMap.put(2, "Purse");
		myMap.put(3, "Wallet");
		myMap.put(4, "Mobile");
		myMap.put(5, "Microphone");
		
		System.out.println("The elements in the map are: ");
		System.out.println(Arrays.asList(myMap));
		System.out.println(myMap.get(4));
		System.out.println(myMap.get(1));
		
		LinkedList<String> myLinkedList = new LinkedList<String>();
		myLinkedList.add("House");
		myLinkedList.add("Tree");
		myLinkedList.add("Kitchen");
		myLinkedList.add("Hall");
		myLinkedList.add("Phone");
		
		System.out.println("The elements in the Linked list are: ");
		System.out.println(myLinkedList);
		System.out.println("The first element in the list is: " + myLinkedList.getFirst());
		System.out.println("The last element in the list is: " + myLinkedList.getLast());
		
		Stack<String> myStack = new Stack<String>();
		myStack.push("Pen");
		myStack.push("Paper");
		myStack.push("Eraser");
		myStack.push("Charger");
		myStack.push("Power Bank");
		
		System.out.println("The elements in the stack are: ");
		System.out.println(myStack);
		System.out.println("The first element in the stack is: " + myStack.peek());
		System.out.println("The popped out item from the stack is: " + myStack.pop());
		System.out.println(myStack);
		
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.add("Rubber");
		myQueue.add("Headphones");
		myQueue.add("Laptop");
		myQueue.add("Mask");
		myQueue.add("Timer");
		
		System.out.println("The elements in the Queue are: ");
		System.out.println(myQueue);
		System.out.println("The polled out item from the queue is: " + myQueue.poll());
		System.out.println(myQueue);
	}

}
