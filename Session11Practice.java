package com.practice.session11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Session11Practice {
	
	public static void main(String[] args) {
		
		College college1 = new College(123, "Narayana");
		
		College college2 = new College(234, "Chaitanya");
		
		College college3 = new College(345, "GRIET");
		
		List <College> myList = new ArrayList<College>();
		myList.add(college1);
		myList.add(college2);
		myList.add(college3);
		
		System.out.println(myList);
		
		Map<Integer, College> myMap = new HashMap<Integer, College>();
		myMap.put(1, college1);
		myMap.put(2, college2);
		myMap.put(3, college3);
		
		System.out.println(myMap);
	}
}
class College {
	
	int collegeId;
	String collegeName;
	
	public College(int id, String name) {
		
		this.collegeId = id;
		this.collegeName = name;
	}
	
	public College() {
		
	}
	
	public String toString() {
		
		return "College id is: " + collegeId + " " +  "College name is: " + collegeName;
	}
}


