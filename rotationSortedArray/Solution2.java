package com.leetcode.rotationSortedArray;

public class Solution2 {
	
	/*
	 To understand the boundaries, use the following 3 examples:
	 [2,1], [2,3,1], [3,1,2]
	 */
	public int findMin(int[] nums) {
		if(nums==null || nums.length==0)
			return -1;
		
		int i=0;
		int j=nums.length-1;
		
		while(i<=j) {
			if(nums[i]<=nums[j])
				return nums[i];
			
			int m=(i+j)/2;
			
			if(nums[m]>=nums[i]) {
				i=m+1;
			}else {
				j=m;
			}
		}
		return -1;
	}
}
