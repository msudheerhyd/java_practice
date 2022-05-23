package com.practice.session36;

import java.util.ArrayList;

public class Session36Practice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		//Lambda
		arrList.forEach( (n) -> { System.out.println(n); } );
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Sunil kumar");
		stringList.add("Sudheer");
		stringList.add("Saroja");
		stringList.add("Vengaiah");
		//Lambda
		stringList.forEach( (n) -> { System.out.println(n.length()) ; } );
	}
}
