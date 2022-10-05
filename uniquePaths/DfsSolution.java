package com.leetcode.uniquePaths;

public class DfsSolution {

	public int uniquePaths(int m, int n) {
		return dfs(0,0,m,n);
	}
	
	public int dfs(int i, int j, int m , int n) {
		if(i==m-1 && j==n-1) {
			return 1;
		}
		
		if(i<m-1 && j<n-1) {
			return dfs(i+1,j,m,n) + dfs(i,j+1,m,n);
		}
		
		if(i<m-1) {
			return dfs(i+1,j,m,n);
		}
		
		if(j<n-1) {
			return dfs(i,j+1,m,n);
		}
		
		return 0;
	}
}
