package com.practice.youtubeSession4;

public class StairCase {
	
	public static void main(String[] args) {
		
		int numSteps = 10;
		int stepWidth = 5; 
		for (int i=0; i<numSteps; i++) {
			for (int j=0; j<(i+1) * stepWidth; j++) {
				System.out.print("*");
			}
			//change row
			System.out.println();
		}
	}
}
