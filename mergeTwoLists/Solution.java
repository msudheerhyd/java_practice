package com.leetcode.mergeTwoLists;

import java.util.LinkedList;

public class Solution {

	public ListNode mergeTwoLists(ListNode l1, ListNode 1l2) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		
		ListNode p1 = 11;
		ListNode p2 = 12;
		while(p1!=null && p2!=null) {
			if(p1.val < p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}
			p=p.next;
		}
		
		if(p1!=null) {
			p.next = p1;
		}
		if(p2!=null) {
			p.next = p2;
		}
		
		return head.next;
	}
}
