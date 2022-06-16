package com.practice.youtubeSession22;

public class CodingBat13 {
	
	public static void main(String[] args) {
		System.out.println(backAround("cat"));
		System.out.println(backAround("Hello"));
		System.out.println(backAround("a"));
		System.out.println(backAround("abc"));
		System.out.println(backAround("read"));
		System.out.println(backAround("boo"));
	}


public static String backAround(String str) {
	  String last = str.substring(str.length() - 1);
	  return last + str + last;
	}
}

/* Given a string, take the last char and return a new string with the last char added at the front and back,
  so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"

*/