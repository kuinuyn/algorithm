package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Baek1406 {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			LinkedList<Character> list = new LinkedList<>();
			for(char c : str.toCharArray()) {
				list.add(c);
			}
			
			ListIterator<Character> itr = list.listIterator();
			while(itr.hasNext()) {
				itr.next();
			}
			

			int n = Integer.parseInt(br.readLine());
			while(n > 0) {
				char[] c = br.readLine().toCharArray();
				
				if(c.length > 1) {
					char add = c[c.length-1];
					
					itr.add(add);
				}
				else if(c[0] == 'L') {
					if(itr.hasPrevious()) {
						itr.previous();
					}
				}
				else if(c[0] == 'D') {
					if(itr.hasNext()) {
						itr.next();
					}
				}
				else if(c[0] == 'B' && itr.hasPrevious()) {
					if(itr.hasPrevious()) {
						itr.previous();
						itr.remove();
					}
				}
				
				n--;
			}
			
			for(char c : list) {
				bw.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				isr.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
