package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
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
//		int[] numbers = {9, 111, 2, 9, 54, 991, 929, 949, 959, 999, 53, 346, 341, 551, 9, 6, 10, 2, 33, 30, 34, 5, 9};
//		int[] numbers = {0, 1000, 10, 100, 0, 1, 3};
		int[] numbers = {0, 0};
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
		StringBuffer answer = new StringBuffer();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		
		//{1000, 10, 100, 0, 1, 3};
		Collections.sort(list, (a, b) -> {
			String as = String.valueOf(a), bs = String.valueOf(b);
			return Integer.compare(Integer.parseInt(bs + as), Integer.parseInt(as + bs));
		});
		
		for(int i = 0; i < list.size(); i++) {
			answer.append(list.get(i));
		}
		
		return answer.toString().charAt(0) == '0' ? "0" : answer.toString();
	}
}
