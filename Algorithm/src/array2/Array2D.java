package array2;

import java.util.ArrayList;
import java.util.List;

public class Array2D {
	public static void main(String[] args) {
		//1. 2차원배열의 크기가 같을 경우
		int[][] grid = new int[3][4];
//		System.out.println("===1번======");
		print(grid);
		
		//2. 2차원배열크기가 다른경우
		int[][] grid2 = new int[3][];
//		System.out.println("===2번======");
		grid2[0] = new int[1];
		grid2[1] = new int[1];
		grid2[2] = new int[5];
		print(grid2);
		
		//3. 초기화와 동시에 값을 넣을때
		int[][] grid3 = {{1,2}, {0,0,3}, {4,5,6}};
//		System.out.println("===3번======");
		print(grid3);
		
		int[][] nums = { { 1, 2 }, { 2, 3 } };
		int[] nums1 = { 1, 2 };
		List<Integer> result1D = convert_ArrayTolist(nums1);
		System.out.println(result1D);
		convert_ListToArray(result1D);
		
		List<List<Integer>> result = convert(nums);
		System.out.println(result);
		convert2(result);
		System.out.println(convert_ListInArray(result));
	}
	
	public static void print(int[][] grid) {
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static List<Integer> convert_ArrayTolist(int[] grid) {
		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i<grid.length; i++) {
			result.add(grid[i]);
		}
		
		return result;
	}
	
	private static int[] convert_ListToArray(List<Integer> list) {
		int[] result = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			result[i] = list.get(i);
			System.out.print(result[i]);
		}
		
		System.out.println();
		return result;
	}
	
	public static int[][] convert2(List<List<Integer>> list) {
		int[][] result = new int[list.size()][];
		
		for(int i=0; i<list.size(); i++) {
			result[i] = new int[list.get(i).size()];
			for(int j=0; j<list.get(i).size(); j++) {
				result[i][j] = list.get(i).get(j);
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		return result;
	}
	
	public static List<List<Integer>> convert(int[][] a) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {
			list = new ArrayList<>();
			for(int j=0; j<a[i].length; j++) {
				list.add(a[i][j]);
			}
			result.add(list);
		}
		
		return result;
	}
	
	private static List<int[]> convert_ListInArray(List<List<Integer>> list) {
		List<int[]> intArrayList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			int[] resultArr = new int[list.get(i).size()];
			for (int j = 0; j < resultArr.length; ++j) {
				resultArr[j] = list.get(i).get(j);
			}
			intArrayList.add(resultArr);
		}
		
		return intArrayList;
	}
}
