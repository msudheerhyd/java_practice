package com.practice.session28;

import java.util.Scanner;

public class Session28Practice {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the input: ");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[i]);
		}
		catch(Exception e) {
			System.out.println("Some error occured");
		}
		
		System.out.println("My name is Bond");
	}
}
