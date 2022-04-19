package com.tuesday.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TuesdayPractice {
	
	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<Integer, String> ();
			
		myMap.put(1, "Sunil");
		myMap.put(2, "Sudheer");
		myMap.put(3, "Prashanth");
		myMap.put(4, "Mahidhar");
		
		System.out.println("The elements in the map are:");
		System.out.println(Arrays.asList(myMap));
		System.out.println(myMap.get(3));
	}
} 
