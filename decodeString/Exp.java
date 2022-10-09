package com.leetcode.decodeString;

import java.util.ArrayList;
import java.util.List;

public class Exp {

	int count;
	List<Exp> list;
	char c;
	
	public Exp(int num) {
		count = num;
		list = new ArrayList<>();
	}
	
	public Exp(char ch) {
		c = ch;
	}
	
	public String getStr() {
		String result = "";
		
		if(list != null) {
			for(int i = 0; i < count; i++) {
				for(Exp e: list) {
					result += e.getStr();
				}
			}
		} else {
			result += c;
		}
		
		return result;
	}
}
