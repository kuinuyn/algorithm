package compare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest2 {
	public static void main(String[] args) {
		String[] input = {"a", "b", "c", "a", "b", "c", "b", "c", "d"};
//		String[] input = {"i", "study", "inflearn", "i", "study", "coding"};
		int k = 3;
		
		System.out.println(solve(input, k));
	}
	
	public static List<String> solve(String[] input, int k) {
		List<String> result = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : input) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		Queue<Map.Entry<String, Integer>> qp = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue());
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
			qp.offer(entry);
		}
		
		while(k > 0) {
			result.add(qp.poll().getKey());
			k--;
		}
		
		return result;
	}
}
