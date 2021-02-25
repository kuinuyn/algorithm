package string;

public class StringExam3 {
	public static void main(String[] args) {
		String str[] = {"teacher", "tessore", "test"};
		
		System.out.println(solve(str));
	}
	
	public static String solve(String[] strs) {
		String findStr = strs[0];
		
		for(int i=0; i<strs.length; i++) {
			if(findStr.length() > strs[i].length()) {
				findStr = strs[i];
			}
		}
		
		
		for(int i = 0; i<strs.length; i++){
			while(strs[i].indexOf(findStr) < 0) {
				findStr = findStr.substring(0, findStr.length() - 1);
			}
		}
		
		return findStr;
	}
}
