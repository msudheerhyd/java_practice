package com.practice.session39;

public class CodingBat3 {
	
	public static void main(String[] args) {
		
		System.out.println(sumDouble(1, 2));
		System.out.println(sumDouble(3, 2));
		System.out.println(sumDouble(2, 2));
		System.out.println(sumDouble(-1, 0));
		System.out.println(sumDouble(3, 3));
		System.out.println(sumDouble(0, 0));
		System.out.println(sumDouble(0, 1));
		System.out.println(sumDouble(3, 4));
	}
	
	public static int sumDouble(int a, int b) {
		if (a == b) {
			return 2 * (a + b);
		}
		return a + b;
	}
}


/* Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

*/