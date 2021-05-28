package dp;

public class BasicDp {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1, 8};
		BasicDp a = new BasicDp();
		System.out.println(a.solve(nums));
	}
	
	public int solve(int[] nums) {
		if (nums.length == 0)
			return 0;
		int[] dp = new int[nums.length + 1];
		dp[0] = 0;
		dp[1] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int val = nums[i];

			System.out.println(val+" - "+dp[i]+" - "+dp[i - 1]+" "+val+" - "+(dp[i - 1] + val));
			dp[i + 1] = Math.max(dp[i], dp[i - 1] + val);
		}
		//print(dp);
		return dp[nums.length];
	}
	
	public void print(int[] dp) {
		for(int i : dp)
			System.out.println(i);
	}
}
