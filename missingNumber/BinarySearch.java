package com.leetcode.missingNumber;

import java.util.Arrays;

public class BinarySearch {
	
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int l=0, r=nums.length;
		while(l<r) {
			int m = (l+r)/2;
			if(nums[m]>m) {
				r = m;
			}else {
				l = m+1;
			}
		}
		
		return r;
	}
}
