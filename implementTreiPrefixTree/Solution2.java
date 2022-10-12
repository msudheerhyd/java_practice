package com.leetcode.implementTreiPrefixTree;

public class Solution2 {

	private TrieNode2 root;
	
	public Solution2() {
		root = new TrieNode2();
	}
	
	//Inserts a word into the trie.
	public void insert(String word) {
		TrieNode2 p = root;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			int index = c-'a';
			if(p.arr[index]==null) {
				TrieNode2 temp = new TrieNode2();
				p.arr[index]=temp;
				p=temp;
			}else {
				p=p.arr[index];
			}
		}
		p.isEnd=true;
	}
	
	// Returns if the word is in the trie.
	public boolean search(String word) {
		TrieNode2 p = searchNode(word);
		if(p==null) {
			return false;
		}else {
			if(p.isEnd)
				return true;
		}
		
		return false;
	}
	
	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		TrieNode2 p = searchNode(prefix);
		if(p==null) {
			return false;
		}else {
			return true;
		}
	}
	
	public TrieNode2 searchNode(String s) {
		TrieNode2 p = root;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int index = c-'a';
			if(p.arr[index]!=null) {
				p = p.arr[index];
			}else {
				return null;
			}
		}
		
		if(p==root)
			return null;
		
		return p;
	}
}
