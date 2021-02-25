package string;

public class StringExam1 {
	public static void main(String[] args) {
		String nums1 = "123";
		String nums2 = "888";
		System.out.println(solve(nums1, nums2));
	}
	
	public static String solve(String num1, String num2) {
		// 1
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		int num1Length = num1.length() - 1;
		int num2Length = num2.length() - 1;
		
		int n1, n2, sum = 0;
		while(num1Length >= 0 || num2Length >= 0) {
			n1 = num1.charAt(num1Length) - '0';
			n2 = num2.charAt(num2Length) - '0';
			
			sum = carry+n1+n2;
			sb.append((sum)%10);
			carry = sum/10;
			num1Length--;
			num2Length--;
		}
		
		if(carry > 0) {
			sb.append(carry);
		}
		
		return sb.reverse().toString();
	}
}
