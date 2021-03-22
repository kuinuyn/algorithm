package compare;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		int[] a = {1,8,3,5};
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		for(int i : a) {
			priorityQueue.offer(i);
		}
		
		System.out.println(summaryStick(priorityQueue));
		//priorityQueuePoll(priorityQueue);
	}
	
	public static void priorityQueuePoll(PriorityQueue<Integer> priorityQueue) {
		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	}
	
	public static int summaryStick(PriorityQueue<Integer> priorityQueue) {
		int sum = 0;
		int twoSum = 0;
		
		while(priorityQueue.size() > 1) {
			twoSum = priorityQueue.poll()+priorityQueue.poll();
			sum += twoSum;
			priorityQueue.offer(twoSum);
		}
		
		return sum;
	}
}
