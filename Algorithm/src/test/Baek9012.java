package test;

import java.util.Scanner;

public class Baek9012 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String str = "";
		int count = 0;
		
		int limitLine = Integer.parseInt(in.nextLine());
		
		while(limitLine > 0) {
			str = in.nextLine();
			count = 0;
			sb = new StringBuffer();
			
			for(char c : str.toCharArray()) {
				if(c == '(') {
					count++;
				}
				else if(c == ')' && count > 0) {
					count--;
				}
				else {
					sb.append(c);
				}
			}
			
			if(sb.length() > 0 || count > 0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			
			limitLine--;
		}
		
		in.close();
	}
}
