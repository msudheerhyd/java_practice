package com.practice.session37;

public class Session37Practice {
	
	public static void main(String[] args) {
		
		System.out.println(sumOfNumbers(5));
	}
	public static int sumOfNumbers(int n) {
		if (n > 0) {
			return n + sumOfNumbers(n-1);
		}
		else {
			return 0;
		}
	}
}
