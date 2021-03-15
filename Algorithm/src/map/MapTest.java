package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		String s = "inflearninlove";
		
		System.out.println(s.charAt(solve(s)));
	}
	
	public static int solve(String s) {
		int result = -1;
		
		if(s == null || s.length() < 1) {
			return result;
		}
		
		Map<Character, Integer> param = new HashMap<>();
		char t;
		for(int i=0; i<s.length(); i++) {
			t = s.charAt(i);
//			if(!param.containsKey(t)) {
//				param.put(t, 1);
//			}
//			else {
//				param.put(t, param.get(t)+1);
//			}
			
			param.put(t, param.getOrDefault(t, 0)+1);
		}
		
		for(int i=0; i<s.length(); i++) {
			if(param.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return result;
	}
}
