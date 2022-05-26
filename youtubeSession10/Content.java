package com.practice.youtubeSession10;

public class Content {
	private String paragraph;
	public Content(String p) {
		paragraph = p;
	}
	public int getCount(String word) {
		String trimmed = paragraph.trim();
		int count = 0, wl = word.length();
		int tl = trimmed.length();
		// e.g. "th"
		if (tl < wl) {
			return 0;
		}
		// count the match if the trimmed string equals 
		// the target.
		// e.g. "the"
		if (tl == wl && trimmed.substring(0, wl).equals(word)) {
			count++;
		}
		// from now on, tl > wl is implied 
		// count the first word if it matches the search
		// e.g. "the cat"
		if (trimmed.substring(0, wl).equals(word)) {
			count++;
		}
		// count the last word if it matches the search
		// e.g. "is the"
		if ((trimmed.substring(tl - wl)).equals(word) 
				&& trimmed.charAt(tl - wl -1) == ' ') {
			count++;	
		}
		// finished checking the first and last words
		// go through the middle substring with a window
		// count word if it is surrounded by spaces
		for(int i = wl; i < tl - wl; i++) {
			if ((trimmed.substring(i, i + wl)).equals(word)
					&& trimmed.charAt(i + wl) == ' '
					&& trimmed.charAt(i - 1) ==' ')
				count++;
		}
		return count;	
	}
}
