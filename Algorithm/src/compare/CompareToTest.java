package compare;

public class CompareToTest {
	public static void main(String[] args) {
		String v1 = "8.5.2.4.1";
		String v2 = "8.5.2.4";
		
		System.out.println(solve(v1, v2));
	}
	
	public static int solve(String v1, String v2) {
		int result = 0;
		String[] v1A = v1.split("\\.");
		String[] v2A = v2.split("\\.");
		
		int len = v1A.length > v2A.length ? v1A.length : v2A.length;
		Integer ver1 = 0;
		Integer ver2 = 0;
		
		for(int i=0; i<len; i++) {
			ver1 = v1A.length <= i ? 0 : Integer.parseInt(v1A[i]);
			ver2 = v2A.length <= i ? 0 : Integer.parseInt(v2A[i]);
			if(ver1.compareTo(ver2) != 0) {
				
				result = ver1.compareTo(ver2);
				break;
			}
			
		}
		
		return result;
	}
}
