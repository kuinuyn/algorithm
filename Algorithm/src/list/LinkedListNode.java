package list;

import java.util.HashSet;

public class LinkedListNode {
	Node header;
	int size;
	
	public static class Node {
		Object data;
		Node next = null;
	}
	
	public LinkedListNode() {
		header = new Node();
	}
	
	public void append(Object d) {
		Node end = new Node();
		end.data = d;
		
		Node start = header;
		while(start.next != null) {
			start = start.next;
		}
		
		size++;
		start.next = end;
	}
	
	public void delete(Object d) {
		Node start = header;
		
		while(start.next != null) {
			if(start.next.data.equals(d)) {
				start.next = start.next.next;
				size--;
			}
			else {
				start = start.next;
			}
		}
	}
	
	public void desc() {
		Node l = header.next;
		
		while(l.next != null) {
			System.out.print(l.data+" -> ");
			l = l.next;
		}
		
		System.out.println(l.data);
	}
	
	//중복제거
	public void dupRemove() {
		Node l = header.next;
		
		//1. 버퍼를 이용한 방식
		HashSet<Object> remove = new HashSet<>();
		while(l.next != null) {
			remove.add(l.data);
			if(remove.contains(l.next.data)) {
				size--;
				l.next = l.next.next;
			}
			else {
				remove.add(l.next.data);
				l = l.next;
			}
			
		}
		
		//2. 버퍼가 없이 index를 이용하는 방식
		Node r = null;
		while(l.next != null) {
			r = l;
			while(r.next != null) {
				if(l.data.equals(r.next.data)) {
					r.next = r.next.next;
				}
				else {
					r = r.next;
				}
			}
			l = l.next;
		}
	}
	
	//목록을 카운팅하여 역으로 들어오는 방법
	public Node KthToLastCount(Node first, int k) {
		Node n = first;
		
		int total = 1;
		while(n.next != null) {
			total++;
			n = n.next;
		}
		
		n = first;
		for(int i=1; i<total-k+1; i++) {
			n = n.next;
		}
		
		return n;
	}
	
	//재귀함수를 이용하여 뒤에서부터 카운트하는 방법
	public int KthToLastRecur(Node n, int k) {
		if(n == null) {
			return 0;
		}
		
		int count = KthToLastRecur(n.next, k)+1;
		
		if(k == count) {
			System.out.println(k+" th to last node is "+n.data);
		}
		
		return count;
	}
	
	public Node getFirst() {
		return header;
	}
	
	public int size() {
		return size;
	}
	
	public Object get(Node n) {
		Node first = header.next;
		
		while(first.next != null) {
			if(n.data == first.data) {
				break;
			}
			else {
				first = first.next;
			}
		}
		
		return first.data;
	}
	
	public Node KthToLastPointer(Node first, int k) {
		Node n1 = first;
		Node n2 = first;
		
		for(int i=0; i<k; i++) {
			if(n1 == null) return null;
			n1 = n1.next;
		}
		
		while(n1 != null) {
			n1 = n1.next;
			n2 = n2.next;
		}
		
		return n2;
	}
}
