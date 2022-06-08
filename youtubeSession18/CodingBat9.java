package com.practice.youtubeSession18;

public class CodingBat9 {
	
	public static void main(String[] args) {
		
		System.out.println(notString("candy"));
		System.out.println(notString("x"));
		System.out.println(notString("not bad"));
		System.out.println(notString("bad"));
		System.out.println(notString("not"));
		System.out.println(notString("is not"));
		System.out.println(notString("no"));
	}
	
	public static String notString(String str) { 
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}
		
		return "not " + str;
	}
}


/* 
 Given a string, return a new string where "not " has been added to the front.
 However, if the string already begins with "not", return the string unchanged.
 Note: use .equals() to compare 2 strings.

 notString("candy") → "not candy"
 notString("x") → "not x"
 notString("not bad") → "not bad"
*/