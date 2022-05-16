package com.practice.session29;

import java.io.File;

public class Session29Practice {
	
	public static void main(String[] args) {
		
		File myFile = new File("sudheer.txt");
		File myFile2 = new File("sunil.txt");
		try {
			myFile.createNewFile();
			myFile2.createNewFile();
			System.out.println("File is created");
		}
		catch(Exception e) {
			System.out.println("An error occured while creating file");
		}
	}
}
