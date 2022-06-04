package com.practice.youtubeSession16;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		int[][] m1 = {{1, 2, 3}, {4, 5, 6}}; // 2 x 3 matrix
		int[][] m2 = {{1, 2}, {3, 4}, {5, 6}}; // 3 x 2 matrix
		if (m1[0].length != m2.length) {
			System.out.println("Multiplication undefined");
		}
		else {
			int[][] result = multiply(m2, m1);
			for (int row = 0; row < result.length; row++) {
				for (int column = 0; column < result[0].length; column++) {
					System.out.print(result[row][column] + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static int[][] multiply(int[][] mat1, int[][] mat2) {
		// all elements are initialized to be zeros
		int[][] answer = new int[mat1.length][mat2[0].length];
		for (int row = 0; row < mat1.length; row++) {
			for (int column = 0; column < mat2[0].length; column++) {
				for (int i = 0; i < mat1[0].length; i++) {
					answer[row][column] += mat1[row][i] * mat2[i][column]; 
				}
			}
		}
		return answer;
	}
}
