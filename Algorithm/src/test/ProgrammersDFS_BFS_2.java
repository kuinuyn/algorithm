package test;

public class ProgrammersDFS_BFS_2 {
	public static void main(String[] args) {
		int prices[] = {1, 2, 3, 2, 3};
		int result[] = solution(prices);
		
		for(int rs : result) {
			System.out.println(rs);
		}
	}
	
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int count;
		
		for(int i=0; i<prices.length; i++) {
			count = 0;
			for(int j=i; j<prices.length; j++) {
				if(j!=i && prices[i] <= prices[j]) {
					count++;
				}
			}
			answer[i] = count;
		}
		
		return answer;
	}
}
