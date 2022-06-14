package com.practice.youtubeSession20;

public class CodingBat11 {
	
	public static void main(String[] args) {
		
		System.out.println(frontBack("code"));
		System.out.println(frontBack("a"));
		System.out.println(frontBack("ab"));
		System.out.println(frontBack("abc"));
		System.out.println(frontBack(""));
		System.out.println(frontBack("chocolate"));
		System.out.println(frontBack("aavJ"));
		System.out.println(frontBack("hello"));
	}
	
	public static String frontBack(String str) {
		if (str.length() <= 1) return str;
		
		String mid = str.substring (1, str.length()-1);
		
		return str.charAt(str.length()-1) + mid + str.charAt(0);
	}
}



/* Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

*/
