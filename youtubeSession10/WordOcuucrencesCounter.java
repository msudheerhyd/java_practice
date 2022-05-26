package com.practice.youtubeSession10;

import java.util.Scanner;

public class WordOcuucrencesCounter {
	
	public static void main(String[] args) {
		System.out.println("Enter your passage");
		Scanner scan = new Scanner(System.in);
		String content = scan.nextLine();
		System.out.println("Enter the string to be found out: ");
		Content myContent = new Content(content);
		String someString = scan.nextLine();
		scan.close();
		//String word = "there";
		System.out.println(someString + ": " + myContent.getCount(someString));
		
	}
}
