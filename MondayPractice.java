package com.monday.java;

import java.util.ArrayList;
import java.util.List;

public class MondayPractice {
	
	public static void printArray(int[] arr) {
		
		System.out.println("The integers in the array are:");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
	public static void printCharArray(char[] arr) {
		
		System.out.println("The characters in the array are:");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
	
	public static void printStringsArray(String[] str) {
		
		System.out.println("The Strings in the array are:");
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i] + ", ");
		}
		System.out.println();
	}
	
	public static void printListStrings(List<String> familyList) {
		
		System.out.println("The Family List is:");
		for (int i=0; i<familyList.size(); i++) {
			System.out.print(familyList.get(i) + ", ");
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		printArray(arr1);
		
		char[] arr2 = {'a', 'b', 'c', 'd', 'e'};
		printCharArray(arr2);
		
		
		String[] str1 = {"Kolkata", "Delhi", "Paris", "New York", "Bhutan"};
		printStringsArray(str1);
		
		List<String> myList2 = new ArrayList<String>();
		myList2.add("Sudheer");
		myList2.add("Sunil");
		myList2.add("Saroja");
		myList2.add("Vengaiah");
		printListStrings(myList2);
		
	}
}
