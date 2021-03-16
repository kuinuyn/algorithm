package array1;

import java.util.HashMap;
import java.util.Map;

public class Array1_2 {
	public static void main(String[] args) {
		int sums[] = {3,4,7,2,-3,1,4,2};
		int k = 7;
		
		//System.out.println(subArraySum(sums, k));
		System.out.println(subArrayMap(sums, k));
	}
	
	public static int subArraySum(int[] nums, int k) {
		int count = 0;
		int sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum = 0;
			for(int j=i; j<nums.length; j++) {
				sum += nums[j];
				if(sum == k) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static int subArrayMap(int[] nums, int k) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			if(map.containsKey(sum-k)) {
				count += map.get(sum-k);
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		
		return count;
	}
}
