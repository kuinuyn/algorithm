package list;

import java.util.HashSet;

public class LinkedListNode {
	Node header;
	
	static class Node {
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
		
		start.next = end;
	}
	
	public void delete(Object d) {
		Node start = header;
		
		while(start.next != null) {
			if(start.next.data.equals(d)) {
				start.next = start.next.next;
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
	
	public Node getFirst() {
		return header;
	}
}
