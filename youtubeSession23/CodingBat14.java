package com.practice.youtubeSession23;

public class CodingBat14 {
	
	public static void main(String[] args) {
		System.out.println(or35(3));
		System.out.println(or35(10));
		System.out.println(or35(8));
		System.out.println(or35(15));
		System.out.println(or35(5));
		System.out.println(or35(9));
		System.out.println(or35(4));
		System.out.println(or35(7));
		System.out.println(or35(6));
		System.out.println(or35(17));
		System.out.println(or35(18));
		System.out.println(or35(29));
		System.out.println(or35(20));
		System.out.println(or35(21));
		System.out.println(or35(22));
		System.out.println(or35(45));
		System.out.println(or35(99));
		System.out.println(or35(100));
		System.out.println(or35(101));
		System.out.println(or35(121));
		System.out.println(or35(122));	
		System.out.println(or35(123));
		
	}
	public static boolean or35(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}
}

/* Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
  Use the % "mod" operator -- see Introduction to Mod

or35(3) → true
or35(10) → true
or35(8) → false

*/
