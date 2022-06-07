package com.practice.youtubeSession17;

public class CodingBat8 {
	
	public static void main(String[] args) {
		System.out.println(posNeg(1, -1, false));
		System.out.println(posNeg(-1, 1, false));
		System.out.println(posNeg(-4, -5, true));
		System.out.println(posNeg(-4, -5, false));
		System.out.println(posNeg(-4, 5, false));
		System.out.println(posNeg(-4, 5, true));
		System.out.println(posNeg(1, 1, false));
		System.out.println(posNeg(-1, -1, false));
		System.out.println(posNeg(1, -1, true));
		System.out.println(posNeg(-1, 1, false));
		System.out.println(posNeg(1, 1, false));
		System.out.println(posNeg(-1, -1, true));
		System.out.println(posNeg(5, -5, false));
		System.out.println(posNeg(-6, 6, false));
		System.out.println(posNeg(-5, -6, false));
		System.out.println(posNeg(-2, -1, false));
		System.out.println(posNeg(-5, -6, false));
		System.out.println(posNeg(-5, -5, true));
		
	}
	public static boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			if (a < 0 && b < 0) {
				return true;
			}
		}
		if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
			return true;
		}
		return false;
	}
}


/* Given 2 int values, return true if one is negative and one is positive.
   Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

*/