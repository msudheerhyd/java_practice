package com.leetcode.houseRobber;

public class Solution2 {

	public int rob(int[] num) {
		if(num == null || num.length == 0)
			return 0;
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(i % 2 == 0) {
				even += num[i];
				even = even > odd ? even : odd;
			} else {
				odd += num[i];
				odd = even > odd ? even : odd;
			}
		}
		
		return even > odd ? even : odd;
	}
}
