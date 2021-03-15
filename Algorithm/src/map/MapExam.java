package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		for(int key : map.keySet()) {
			System.out.println(key+" - "+map.get(key));
		}
		
		System.out.println();
		
		for(Map.Entry<Integer, Object> key : map.entrySet()) {
			System.out.println(key.getKey()+" - "+key.getValue());
		}
		
		System.out.println();
		
		Iterator<Integer> itr = map.keySet().iterator();
		int key = 0;
		while(itr.hasNext()) {
			key = itr.next();
			System.out.println(key+" - "+map.get(key));
		}
	}
}
