package com.practice.session37;

public class CodingBat1 {
	
	public static void main(String[] args) {
		
		System.out.println(sleepIn(false, false));
		System.out.println(sleepIn(true, false));
		System.out.println(sleepIn(false, true));
		System.out.println(sleepIn(true, true));
	}
/*
	The parameter weekday is true if it is a weekday,
	and the parameter vacation is true if we are on vacation.
  	We sleep in if it is not a weekday or we're on vacation.
	Return true if we sleep in.
	   
	sleepIn(false, false) → true
	sleepIn(true, false) → false
	sleepIn(false, true) → true 
*/
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
