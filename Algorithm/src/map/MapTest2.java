package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,2,3,5,5,5,5,6,6,6};
		int k = 2;
		
//		System.out.println(solve(nums, k));
		System.out.println(topFrequent(nums, k));
	}
	
	/*public static List<Integer> solve(int[] nums, int k) {
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>(); // 결과값
		// 1. 배열의 순서를 Map(getDefault)를 이용하여 카운팅
		for(int num : nums) {
			numMap.put(num, numMap.getOrDefault(num, 0)+1);
		}
		
		// 2. Map의 값을 Value값의 순으로 List로 반환
		int count = 0;
		int resultKey = 0;
		while(count < k) {
			int max = -1;
			for(int key : numMap.keySet()) {
				if(max < 0) {
					max = numMap.get(key);
				}
				else {
					if(max < numMap.get(key)) {
						max = numMap.get(key);
						resultKey = key;
					}
				}
			}
			
			result.add(resultKey);
			numMap.remove(resultKey);
			count++;
		}
		
		// 3. k값을 비교하여 list를 반환
		
		return result;
	}*/
	
	
	public static List<Integer> topFrequent(int[] nums, int k) {
		Map<Integer, Integer> hm = new HashMap<>();
		List<Integer>[] list = new List[nums.length + 1];
		List<Integer> res = new ArrayList<>();

		for (int num : nums) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		for (int key : hm.keySet()) {
			int topFrequent = hm.get(key);
			if (list[topFrequent] == null)
				list[topFrequent] = new ArrayList<>();
			list[topFrequent].add(key);
		}
		
		//
		for (int lastIndex = list.length - 1; lastIndex >= 0; lastIndex--) {
			if (list[lastIndex] != null) {
				for (int i = 0; i < list[lastIndex].size() && res.size() < k; i++)
					res.add(list[lastIndex].get(i));
			}
		}
		return res;
	}
}
