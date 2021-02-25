package list;

public class LinkedList {
	Object data;
	LinkedList next = null;
	
	public LinkedList(Object d) {
		this.data = d;
	}
	
	public void append(Object d) {
		LinkedList end = new LinkedList(d);
		LinkedList l = this;
		while(l.next != null) {
			l = l.next;
		}
		
		l.next = end;
	}
	
	public void delete(Object d) {
		LinkedList l = this;
		
		while(l.next != null) {
			if(l.next.data.equals(d)) {
				l.next = l.next.next;
			}
			else {
				l = l.next;
			}
		}
	}
	
	public void desc() {
		LinkedList l = this;
		
		while(l.next != null) {
			System.out.print(l.data+" -> ");
			l = l.next;
		}
		
		System.out.println(l.data);
	}
}
