package string;

public class StringExam4 {
	/*public static void main(String[] args) {
//		String s = "bananas";
		String s = "ooddddod";
//		String s = "even";
//		String s = "abba";
//		String s = "abcd";
		System.out.println(solve(s));
	}
	
	private static int start, end;
	
	public static String solve(String s) {
		int len = s.length();
		if(len < 2) return s;
		
		for (int i = 0; i < len - 1; i++) {
			findSubstring(s, i, i, "odd"); //
			findSubstring(s, i, i + 1, "even"); //
		}
		return s.substring(start, start + end);
	}
	
	private static void findSubstring(String s, int left, int right, String str) {
		
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		if (end < right - left - 1) {
			start = left + 1;
			end = right - left - 1;
		}
	}*/
	
	public static void main(String[] args) {
		String s = "bananas";

		System.out.println(solve(s));
	}

	private static int start, end;
	public static String solve(String str) {
		int len = str.length();
		if(len < 2) return str;

		for(int i=0; i<len-1; i++) {
			findSubstring(str, i, i);
			findSubstring(str, i, i+1);
		}
		
		return str.substring(start, start+end);
	}

	public static void findSubstring(String s, int left, int right) {
		
		while(left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
			left--;
			right++;
		}

		if(end < (right-left-1)) {
			end = right-left-1;
			start = left+1;
		}

	}
}
