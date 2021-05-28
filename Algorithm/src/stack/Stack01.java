package stack;

import java.util.Stack;

public class Stack01 {
	public static void main(String[] args) {
		String s = "12[a]2[bc]2[d]";
		
		System.out.println(solve(s));
	}
	
	static String solve(String s) {
		Stack<Integer> countStack = new Stack<>();
		Stack<StringBuilder> stringStack = new Stack<>();
		StringBuilder result = new StringBuilder();
		int k = 0;
		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				k = k * 10 + ch - '0';
			} else if (ch == '[') {

				countStack.push(k);

				stringStack.push(result);

				result = new StringBuilder();
				k = 0;
			} else if (ch == ']') {
				StringBuilder str = stringStack.pop();

				for (int currentK = countStack.pop(); currentK > 0; currentK--) {
					str.append(result);
				}
				result = str;
			} else {
				result.append(ch);
			}
		}
		System.out.println();
		return result.toString();
	}
}
