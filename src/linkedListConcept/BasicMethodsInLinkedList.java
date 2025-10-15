package linkedListConcept;

import java.util.LinkedList;
public class BasicMethodsInLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.add(39);
		ll.add(59);
		ll.add(7);
		ll.add(8);
		ll.add(66);
		System.out.println("original\n"+ll);
		System.out.println("Size:"+ll.size());
		System.out.println("is Empty:"+ll.isEmpty());
		System.out.println("Indexof:"+ll.indexOf(39));
		ll.clear();
		System.out.println("clear:"+ll);
		
	}
}
