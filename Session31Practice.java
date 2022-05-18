package com.practice.session31;

import java.util.ArrayList;
import java.util.Iterator;

public class Session31Practice {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Mercedes Benz");
		myList.add("Volvo");
		myList.add("BMW");
		myList.add("Jaguar");
		System.out.println("asdasdadsad");
		Iterator<String> myIterator = myList.iterator();
		System.out.println(myIterator.next());
		
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
	}
}
