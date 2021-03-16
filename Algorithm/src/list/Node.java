package list;

public class Node {
	Object data;
	Node next = null;
	
	public Node(Object d) {
		this.data = d;
	}
	
	public void append(Object d) {
		Node end = new Node(d);
		Node l = this;
		while(l.next != null) {
			l = l.next;
		}
		
		l.next = end;
	}
	
	public void delete(Object d) {
		Node l = this;
		
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
		Node l = this;
		
		while(l.next != null) {
			System.out.print(l.data+" -> ");
			l = l.next;
		}
		
		System.out.println(l.data);
	}
}
