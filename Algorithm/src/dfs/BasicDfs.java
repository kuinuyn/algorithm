package dfs;

public class BasicDfs {
	public static void main(String[] args) {
		char[][] grid = {
				{'1', '1', '0', '0', '1'}
				, {'1', '1', '0', '0', '0'}
				, {'0', '0', '0', '0', '0'}
				, {'0', '0', '0', '1', '1'}
			};
		
		System.out.println(bfs(grid));
	}
	
	static int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
	static int m, n;
	public static int bfs(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;
		int count = 0;
		
		m = grid.length;
		n = grid[0].length;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j] == '1') {
					count++;
					
					dfs(grid, i, j);
				}
			}
		}
		
		return count;
	}
	
	public static void dfs(char[][] grid, int i, int j) {
		// 1. error
		if(i<0 || j<0 || i>=m || j>=n || grid[i][j] != '1') {
			return;
		}
		
		grid[i][j] = '0';
		
		for(int[] dir : dirs) {
			dfs(grid, i+dir[0], j+dir[1]);
		}
	}
}
