package com.sudheer.practice;

import java.util.ArrayList;
import java.util.List;

public class ExampleClass {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Array is");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("List is");
		List<String> Mylist = new ArrayList<String>();
		Mylist.add("alpha");
		Mylist.add("beta");
		Mylist.add("cancer");
		Mylist.add("delhi");
		Mylist.add("england");
		
		System.out.println(Mylist);
		
		char[] arr1 = {'!', 'b', 'c', 'd'};
		System.out.println("Array of char is");
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	
		System.out.println("My List size is : " + Mylist.size());
		
		Mylist.remove(2);
		Mylist.remove("delhi");
		System.out.println("After removing cancer, The list is : " + Mylist);
	}
}
