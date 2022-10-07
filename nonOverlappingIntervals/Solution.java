package com.leetcode.nonOverlappingIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public int eraseOverlapIntervals(Interval[] intervals) {
		if(intervals.length < 2) {
			return 0;
		}
		
		Arrays.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}
		});
		
		int end = intervals[0].end;
		int min = 0;
		
		for(int i = 1; i < intervals.length; i++) {
			if(intervals[i].start < end) {
				end = Math.min(end, intervals[i].end);
				min++;
			} else {
				end = intervals[i].end;
			}
		}
		
		return min;
	}
}
