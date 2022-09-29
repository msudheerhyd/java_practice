package com.leetcode.maxSubArray;

public class Solution2 {
	
	public int maxSubArray(int[] nums) {
		int result = nums[0];
		int sum = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			sum = Math.max(nums[i], sum + nums[i]);
			result = Math.max(result, sum);
		}
		
		return result;
	}
}
