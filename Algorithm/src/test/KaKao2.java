package test;

import java.util.HashMap;

public class KaKao2 {
	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = {"eden", "kiki"};
//		String[] participant = {"mislav", "stanko", "mislav", "ana"};
//		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
	}
	
	/*public static int solution(int[] needs, int r) {
		int answer = 0;
		
		
		return answer;
	}*/
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String par : participant) {
			map.put(par, map.getOrDefault(par, 0)+1);
		}
		
		for(String com : completion) {
			map.put(com, map.getOrDefault(com, 0)-1);
		}
		
		for(String key : map.keySet()) {
			if(map.get(key) > 0) {
				answer = key;
			}
		}

		return answer;
	}
}
