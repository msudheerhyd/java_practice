package com.practice.youtubeSession19;

public class CodingBat10 {
	
	public static void main(String[] args) {
		System.out.println(missingChar("kitten", 1));
		System.out.println(missingChar("kitten", 0));
		System.out.println(missingChar("kitten", 4));
		System.out.println(missingChar("Hi", 0));
		System.out.println(missingChar("Hi", 1));
		System.out.println(missingChar("code", 0));
		System.out.println(missingChar("code", 1));
		System.out.println(missingChar("code", 2));
		System.out.println(missingChar("code", 3));
		System.out.println(missingChar("chocolate", 8));
	}
	
	public static String missingChar(String str, int n) {
		String front = str.substring(0, n);
		String back = str.substring(n+1, str.length());
		
		return front + back;
	}
}



/* 	Given a non-empty string and an int n,
   	return a new string where the char at index n has been removed.
 	The value of n will be a valid index of a char in the original string
	(i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"

*/