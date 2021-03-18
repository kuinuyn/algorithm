package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
	int start;
	int end;

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		int[] input1 = {3, 8};
		int[] input2 = {2, 6};
		int[] input3 = {8, 10};
		int[] input4 = {15, 18};
		
		List<int[]> list = new ArrayList<int[]>();
		list.add(input1);
		list.add(input2);
		list.add(input3);
		list.add(input4);
		Collections.sort(list,(a,b) -> a[0]-b[0]);
		
		for(int[] output : list) {
			System.out.println(output[0]+" : "+output[1]);
		}
		
		System.out.println("\n#### after ####\n");
		
		List<int[]> result = merge(list);
		
		for(int[] output : result) {
			System.out.println(output[0]+" : "+output[1]);
		}
		
		/*Interval in1 = new Interval(3, 8);
		Interval in2 = new Interval(2, 6);
		Interval in3 = new Interval(8, 10);
		Interval in4 = new Interval(15, 18);

		List<Interval> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		
		List<Interval> list = merge(intervals);
		
		
		for(Interval in : list) {
			System.out.println(in.start+" - "+in.end);
		}*/
	}
	
	/*public static List<Interval> merge(List<Interval> intervals) {
		if (intervals.isEmpty())
			return intervals;
         
	    //type1
//		Collections.sort(intervals,(a,b) -> a.start-b.start);
		//type2
		Collections.sort(intervals, comp2);


		List<Interval> result = new ArrayList<Interval>();
		Interval before = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if (before.end >= current.start) {
				before.end = Math.max(current.end, before.end);
			} else {
				result.add(before);
				before = current;
			}
		}

		if (!result.contains(before)) {
			result.add(before);
		}

		return result;
	}*/
	
	//type3
	static Comparator<Interval> comp2 = new Comparator<Interval>() {
		@Override

		public int compare(Interval o1, Interval o2) {
			if (o1.start > o2.start) {
				return 1;
			} else if (o1.start < o2.start) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	
	public static List<int[]> test(List<int[]> input) {
		
		Collections.sort(input,(a,b) -> a[0]-b[0]);
		
		/*Collections.sort(input, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0]-o1[0];
			}
		});*/
		
		return input;
	}
	
	public static List<int[]> merge(List<int[]> input) {
		int[] merge = null;
		Comparator<int[]> chk = null;
		List<int[]> result = new ArrayList<int[]>();
		
		for(int i=1; i<input.size(); i++) {
			input.get(i-1);
			input.get(i);
			chk = (a, b) -> b[0]-a[1];
			
			if(chk.compare(input.get(i-1), input.get(i)) <= 0) {
				merge = new int[2];
				merge[0] = Math.min(input.get(i-1)[0], input.get(i)[0]);
				merge[1] = Math.max(input.get(i-1)[1], input.get(i)[1]);
				
				result.add(merge);
			}
		}
		
		return result;
	}
}
