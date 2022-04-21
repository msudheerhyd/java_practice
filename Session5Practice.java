package com.practice.session5;

import java.util.Stack;

public class Session5Practice {

	public static void main(String[] args) {
		
		Stack<String> myStack = new Stack<String>();
		myStack.push("Rahman");
		myStack.push("Harris Jayraj");
		myStack.push("Yuvan");
		myStack.push("Anirudh");
		
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack);
	}
}
