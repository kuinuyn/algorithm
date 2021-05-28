package test;

import java.util.Arrays;

public class ProgrammersExam {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];;
		int[] copy = {};
		int start, count = 0;
		
		for(int[] command : commands) {
			copy = new int[(command[1]-command[0])+1];
			for(int i=0; i<copy.length; i++) {
				start = (command[0]-1)+i;
				copy[i] = array[start];
			}
			
			Arrays.sort(copy);
			
			answer[count] = copy[command[2]-1];
			count++;
		}
		
	}
}
