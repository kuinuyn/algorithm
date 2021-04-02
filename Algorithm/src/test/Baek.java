package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek {
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int[] rules = rules(x, y);
		
		for(int result : rules) {
			System.out.println(result);
		}
		
		scan.close();*/
		
//		int[] numbers = {6, 10, 2};
//		int[] numbers = {3, 30, 34, 5, 9};
//		int[] numbers = {53, 346, 341, 551, 9};
//		int[] numbers = {531, 346, 341, 551, 999};
//		int[] numbers = {991, 929, 949, 959, 999};
		int[] numbers = {9, 111, 2, 9, 54, 991, 929, 949, 959, 999, 53, 346, 341, 551, 9, 6, 10, 2, 33, 30, 34, 5, 9};
		String answer = solution(numbers);
		System.out.println(answer);
	}
	
	public static int[] rules(int x, int y) {
		int[] result = new int[5];
		
		result[0] = x+y;
		result[1] = x-y;
		result[2] = x*y;
		result[3] = x/y;
		result[4] = x%y;
		
		return result;
	}
	
	public static String solution(int[] numbers) {
		String answer = "";
		
		char n1 = 0, n2 = 0, temp = 0;
		int length = 0;
		
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				length = Math.max(String.valueOf(numbers[i]).length(), String.valueOf(numbers[j]).length());
				
				for(int x=0; x<length; x++) {
					n1 = String.valueOf(numbers[i]).length() <= x ? n1 : String.valueOf(numbers[i]).charAt(x);
					n2 = String.valueOf(numbers[j]).length() <= x ? n2 : String.valueOf(numbers[j]).charAt(x);
					
					if(n1 < n2) {
						temp = (char)numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
						
						break;
					}
					else if(n1 == n2) {
						continue;
					}
					else {
						break;
					}
				}
			}
		}
		
		for(int i : numbers) {
			System.out.println(i);
			answer += i;
		}
		
		return answer;
	}
}
