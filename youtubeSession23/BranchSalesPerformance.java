package com.practice.youtubeSession23;

import java.io.File;
import java.util.Scanner;

public class BranchSalesPerformance {
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file name, including the extension:");
		String 	filename = scan.nextLine();
		scan.close();
		File myFile = new File(filename);
		scan = new Scanner(myFile);
		// yearly sum for all branches
		double yearlySum = 0;
		// quarterly sum for all branches
		// initialized to zero by default
		double[] quarterlySum = new double[4];
		int count = 0;
		while (scan.hasNextDouble()) {
			double sales = scan.nextDouble();
			yearlySum += sales;
			// quarter 0, 1, 2 and 3
			int quarter = count % 4;
			quarterlySum[quarter] += sales;
			count++;
		}
		scan.close();
		System.out.println(yearlySum);
		for (int i = 0; i < 4; i++) {
			System.out.println(quarterlySum[i]);
		}
	}
}
