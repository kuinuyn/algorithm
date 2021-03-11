package array1;

public class Array1_1 {
	public static void main(String[] args) {
		int[] prices = {8, 2, 6, 5, 1, 7, 5};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] nums) {
		int max = 0;
		int sofaNum = nums[0];
		
		for(int num : nums) {
			if(num < sofaNum) {
				sofaNum = num;
			}
			else {
				max = Math.max(max, num-sofaNum);
			}
		}
		
		return max;
	}
}
