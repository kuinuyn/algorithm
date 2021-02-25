package list;

import java.util.HashSet;

public class LinkedListNode {
	LinkedList header;
	
	static class LinkedList {
		Object data;
		LinkedList next = null;
	}
	
	public LinkedListNode() {
		header = new LinkedList();
	}
	
	public void append(Object d) {
		LinkedList end = new LinkedList();
		end.data = d;
		
		LinkedList start = header;
		while(start.next != null) {
			start = start.next;
		}
		
		start.next = end;
	}
	
	public void delete(Object d) {
		LinkedList start = header;
		
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
		LinkedList l = header.next;
		
		while(l.next != null) {
			System.out.print(l.data+" -> ");
			l = l.next;
		}
		
		System.out.println(l.data);
	}
	
	public void dupRemove() {
		LinkedList l = header.next;
		
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
		LinkedList r = null;
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
}
