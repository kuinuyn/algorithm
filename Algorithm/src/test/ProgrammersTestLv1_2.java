package test;

import java.util.Collections;
import java.util.LinkedList;

public class ProgrammersTestLv1_2 {
	public static void main(String[] args) {
		int array[] = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = solution(array, commands);
		
		for(int a : answer) {
			System.out.println(a);
		}
	}
	
	public static int[] solution(int[] arrays, int[][] commands) {
		int[] answer = new int[commands.length];
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=0; i<commands.length; i++) {
			int x = (commands[i][0]-1), y = (commands[i][1]-1);
			list = new LinkedList<>();
			
			for(int j=x; j<=y; j++) {
				list.add(arrays[j]);
			}
			
			Collections.sort(list);
			answer[i] = list.get((commands[i][2]-1));
		}
		
		return answer;
	}
}
