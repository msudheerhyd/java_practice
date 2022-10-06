package com.leetcode.alienDictionary;

public class OrderOfCharacters {
	
	private static void printOrder(String[] words, int n, int alpha) {
		Graph graph = new Graph(alpha);
		
		for(int i=0; i<n-1; i++) {
			String word1 = words[i];
			String word2 = words[i + 1];
			for(int j=0; j<Math.min(word1.length(),
									word2.length());
				j++) {
				if(word1.charAt(j) != word2.charAt(j)) {
					graph.addEdge(word1.charAt(j) - 'a',
								  word2.charAt(j) - 'a');
					break;
				}
			}
		}
		
		graph.topologicalSort();
	}
	
	public static void main(String[] args) {
		String[] words = { "caa", "aaa", "aab" };
		printOrder(words, 3, 3);
	}
}
