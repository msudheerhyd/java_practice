package com.leetcode.decodeString;

import java.util.Stack;

public class Solution {

	public String decodeString(String s) {
		Stack<Exp> stack = new Stack<>();
		
		Exp e = new Exp(1);
		stack.push(e);
		
		String num = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= '0' && c <= '9') {
				num = num + c;
			} else if(c == '[') {
				if(num.length() == 0) 
					continue;
				
				int value = Integer.parseInt(num);
				num = "";
				Exp exp = new Exp(value);
				stack.push(exp);
			} else if(c == ']') {
				Exp top = stack.pop();
				stack.peek().list.add(top);
			} else {
				stack.peek().list.add(new Exp(c));
			}
		}
		
		Exp root = stack.pop();
		
		return root.getStr();
	}
}
