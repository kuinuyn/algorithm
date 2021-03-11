package test;

import list.LinkedListNode;

public class TestClass {
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode();
		ll.append(2);
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(3);
		ll.append(2);
		ll.append(1);
		//ll.append(5);
		//ll.desc();
		//ll.delete(4);
		ll.desc();
		ll.dupRemove();
		ll.desc();
	
	}
	
}
