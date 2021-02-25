package string;

public class StringExam2 {
	public static void main(String[] args) {
//		String s = "(a(b(c)d)";
//		String s = "(((a(b(c(e(f)d))";
//		String s = "in(f(lea)r)n)";
//		String s = "a)b(c)d";
//		String s = "a)b(c)d)";

//		String s = "(()))";
//		String s = "(()";
		String s = "))(())((";
		
		System.out.print(solve(s));
	}
	
	public static String solve(String s) {
		
		StringBuilder rs = new StringBuilder();
		StringBuilder copy = new StringBuilder();
		
		int cnt = 0;
		for(char c : s.toCharArray()) {
			if(c == '(') {
				cnt++;
			}
			else if(c == ')') {
				if(cnt == 0) continue;
				cnt--;
			}
			
			copy.append(c);
		}
		
		
		System.out.println(copy.toString());
		
		for(int i=copy.length()-1; i>=0; i--) {
			//System.out.println("sb "+copy.charAt(i));
			if(copy.charAt(i)=='(' && cnt-- > 0) {
				continue;
			}
			
			rs.append(copy.charAt(i));
		}
		
		/*for(int i=0; i<copy.length(); i++) {
			System.out.print(copy.charAt(i));
			if(copy.charAt(i)=='(' && cnt-- > 0) {
				continue;
			}
			
			rs.append(copy.charAt(i));
		}*/
		
		return rs.reverse().toString();
	}
}
