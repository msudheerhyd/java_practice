package com.leetcode.coinChange;

import java.util.LinkedList;

public class BreathFirstSearch {

	public int coinChange(int[] coins, int amount) {
		if(amount == 0)
			return 0;
		
		LinkedList<Integer> amountQueue = new LinkedList<Integer>();
		LinkedList<Integer> stepQueue = new LinkedList<Integer>();
		
		// to get 0, 0 step is required
		amountQueue.offer(0);
		stepQueue.offer(0);
		
		while (amountQueue.size() > 0) {
			int temp = amountQueue.poll();
			int step = stepQueue.poll();
			
			if(temp == amount)
				return step;
			
			for(int coin : coins) {
				if(temp > amount) {
					continue;
				} else {
					if(!amountQueue.contains(temp + coin)) {
						amountQueue.offer(temp + coin);
						stepQueue.offer(step + 1);
					}
				}
			}
		}
		
		return -1;
	}
}
