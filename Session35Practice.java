package com.practice.session35;

import java.util.HashSet;

public class Session35Practice {
	
	public static void main(String[] args) {
		
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("BMW");
		carSet.add("Benz");
		carSet.add("Volvo");
		carSet.add("LandRover");
		System.out.println(carSet);
		carSet.add("BMW");
		System.out.println(carSet);
		System.out.println(carSet.remove("Benz"));
		System.out.println(carSet);
	}
}

