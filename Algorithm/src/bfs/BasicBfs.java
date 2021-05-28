package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BasicBfs {
	public static void main(String[] args) {
		char[][] grid = {
							{'1', '1', '0', '0', '1'}
							, {'1', '1', '0', '0', '0'}
							, {'0', '0', '0', '0', '0'}
							, {'0', '0', '0', '1', '1'}
						};
		
		System.out.println(bfs(grid));
		
	}
	
	public static int bfs(char[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int count = 0;
		int x = grid.length;
		int y = grid[0].length;
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				if(grid[i][j] == '1') {
					count++;
					bfs(grid, i, j);
				}
			}
		}
		
		return count;
	}
	
	static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
	static int k = 0;
	public static void bfs(char[][] grid, int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {x, y});
		
		while(!queue.isEmpty()) {
			int[] point = queue.poll();
			
			for(int[] dir : dirs) {
				int x1 = point[0]+dir[0];
				int y1 = point[1]+dir[1];
				
				if(x1 >= 0 && y1 >= 0 && x1 < grid.length && y1 < grid[0].length && grid[x1][y1] == '1') {
					grid[x1][y1] = '0';
					queue.offer(new int[] {x1, y1});
				}
			}
		}
		
	}

}
 