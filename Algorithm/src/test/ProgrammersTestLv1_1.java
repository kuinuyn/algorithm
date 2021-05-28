package test;

public class ProgrammersTestLv1_1 {
	public static void main(String[] args) {
		long n = 12345;
		
		int[] answer = solution(n);
		
		for(int a : answer) {
			System.out.println(a);
		}
	}
	
	public static int[] solution(long n) {
		int[] answer = {};
		
		String str = String.valueOf(n);
		answer = new int[str.length()];
		int idx = 0;
		
		for(int i=answer.length-1; i>=0; i--) {
			answer[idx] = Integer.parseInt(String.valueOf(str.charAt(i)));
			idx++;
		}
		
		return answer;
	}
}
