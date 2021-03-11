package array2;

import java.util.HashSet;

public class Array2D_1 {
	public static void main(String[] args) {
		int[][] grid = {{1,1,1}
						, {1,0,1}
						, {1,1,1}};
		
		solve(grid);
	}
	
	public static void solve(int[][] grid) {
		HashSet<Integer> left = new HashSet<>();
		HashSet<Integer> right = new HashSet<>();
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j] == 0) {
					left.add(i);
					right.add(j);
				}
			}
		}
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(left.contains(i) || right.contains(j)) {
					grid[i][j] = 0;
				}
			}
		}
		
		print(grid);
	}
	
	public static void print(int[][] grid) {
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}
