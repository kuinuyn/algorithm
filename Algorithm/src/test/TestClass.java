package test;

import list.LinkedListNode;
import list.LinkedListNode.Node;

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
//		ll.append(5);
//		ll.desc();
//		ll.delete(4);
//		ll.desc();
//		ll.dupRemove();
		ll.desc();
//		System.out.println(ll.size());
	
		Node n = ll.KthToLastCount(ll.getFirst(), 6);
		System.out.println(ll.get(n));
		n = ll.KthToLastPointer(ll.getFirst(), 6);
		System.out.println(ll.get(n));
		ll.KthToLastRecur(ll.getFirst(), 6);
	}
	
}
