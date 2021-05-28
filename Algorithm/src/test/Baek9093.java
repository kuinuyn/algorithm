package test;

import java.util.Scanner;

public class Baek9093 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		String str = "";
		String[] strs;
		
		int limitLine = Integer.parseInt(in.nextLine());
		
		while(limitLine > 0) {
			str = in.nextLine();
			strs = str.split("\\s+");
			result = new StringBuilder();
			
			for(String s : strs) {
				sb = new StringBuilder();
				for(char c : s.toCharArray()) {
					sb.append(c);
				}
				result.append(sb.reverse().toString()+" ");
			}
			
			limitLine--;
			System.out.println(result.toString().substring(0, result.toString().length()-1));
		}
		
		in.close();
	}
}
