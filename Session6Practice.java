package com.practice.session6;

import java.util.LinkedList;
import java.util.Queue;

public class Session6Practice {

		public static void main(String[] args) {
			
			Queue<String> myQueue = new LinkedList<String>();
			myQueue.add("Cricket");
			myQueue.add("Football");
			myQueue.add("Chess");
			myQueue.add("F1 Racing");
			myQueue.add("Tennis");
			
			System.out.println(myQueue.poll());
			System.out.println(myQueue);
		
		}
}
