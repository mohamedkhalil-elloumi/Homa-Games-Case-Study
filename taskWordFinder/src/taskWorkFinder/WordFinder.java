package taskWorkFinder;

import java.util.ArrayList;

public class WordFinder {
	private ArrayList<String> L;
	

	public WordFinder(ArrayList<String> l) {
		L = l;
	}
	
	public String longestWord(String s) {
		if (!isValidWord(s)) {
			return null;
		}
		
		String res = "";
		int l = 0;
		
		for(String w : L) {
			if (l < w.length() && isSubString(w, s)) {
				res = w;
				l = w.length();
			}
		}
		
		return res;
	}
	
	private static boolean isValidWord(String s) {
		return s != null && s.length() <= 12 && s.matches("^[a-z]*$");
	}
	
	private static boolean isSubString(String s, String t) {
		int m = s.length(), n = t.length();
		
		int j = 0;
		for (int i = 0; i < n && j < m; i++) {
			if (s.charAt(j) == s.charAt(i)) {
				j++;
			}
		}
		
		return j == m;
	}
	
}
