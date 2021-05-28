package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BasicBfsApplication {
	public static void main(String[] args) {
		int[][] grid = {
				{ 0, 0, 3, 3 } 
				, { 1, 4, 0, 1 } 
				, { 1, 0, 0, 1 } 
				, { 1, 0, 0, 1 } 
				, { 1, 2, 2, 0 }
				, { 1, 1, 0, 0 } };
		
		int[] result = solution(grid);
		for (int i : result) {
			System.out.println("i: " + i);
		}
	}
	
	static int[][] dirs = {
					{0,1}
					, {1,0}
					, {0,-1}
					, {-1,0}
					};
	static int m = 0, n = 0;
	static boolean[][] visited;
	public static int[] solution(int[][] grid) {
		int[] result = new int[2];
		m=grid.length; 
		n=grid[0].length;
		int count = 0; //숫자 종류의 수
		int maxSize = 0; //가장 긴 숫자의 수
		int thisAreaSize = 0;
		visited = new boolean[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(visited[i][j] || grid[i][j] == 0) {
					continue;
				}
				count++;
				thisAreaSize = bfs(grid, i, j, visited);
				maxSize = Math.max(maxSize, thisAreaSize);
			}
		}
		
		result[0] = count; //숫자 종류의 수
		result[1] = maxSize; //가장 긴 숫자의 수
		return result;
	}
	
	public static int bfs(int[][] grid, int i, int j, boolean[][] visited) {
		int result = 0;
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[]{i, j});
		visited[i][j] = true;
		int[] point;
		
		while(!queue.isEmpty()) {
			point = queue.poll();
			result++;
			
			for (int[] dir : dirs) {
				int newX = point[0] + dir[0];
				int newY = point[1] + dir[1];
				if (newX >= 0 && newY >= 0 && newX < m && newY < n) {
//					System.out.println("grid[i][j]  "+grid[i][j] +" grid[newX][newY] "+grid[newX][newY]);
					if (!visited[newX][newY] && grid[i][j] == grid[newX][newY]) {
						queue.add(new int[] { newX, newY });
						visited[newX][newY] = true;
					}
				}
			}
		}
		
		return result;
	}
}
