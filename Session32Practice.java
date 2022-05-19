package com.practice.session32;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Session32Practice {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Kumar", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Sunil Kumar Mocharla");
		boolean matchFound = matcher.find();
		System.out.println(matchFound);
	}
}
