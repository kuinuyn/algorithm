package test;

import java.util.LinkedList;
import java.util.Scanner;

public class Baek10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		while(row > 0) {
			String str = sc.next();
			
			switch(str) {
				case "push" :
					int data = Integer.parseInt(sc.next());
					list.add(data);
					break;
				case "pop" :
					if(!list.isEmpty()) {
						sb.append(list.pop()).append('\n');
					}
					else {
						sb.append(-1).append('\n');
					}
					break;
				case "size" :
					sb.append(list.size()).append('\n');
					break;
				case "empty" :
					if(list.isEmpty()) {
						sb.append(1).append('\n');
					}
					else {
						sb.append(0).append('\n');
					}
					break;
				case "front" :
					if(!list.isEmpty()) {
						sb.append(list.get(0)).append('\n');
					}
					else {
						sb.append(-1).append('\n');
					}
					break;
				case "back" :
					if(!list.isEmpty()) {
						sb.append(list.get(list.size()-1)).append('\n');
					}
					else {
						sb.append(-1).append('\n');
					}
					break;
			}
			
			row--;
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}
}
