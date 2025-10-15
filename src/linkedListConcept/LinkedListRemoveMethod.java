package linkedListConcept;

import java.util.LinkedList;

public class LinkedListRemoveMethod {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.add(39);
		ll.add(59);
		ll.add(7);
		ll.add(8);
		ll.add(66);
		System.out.println("original\n"+ll);
		ll.removeFirst();
		System.out.println("After removeFirst\n"+ll);
		ll.removeLast();
		System.out.println("After removeLast\n"+ll);
		ll.remove(2);
		System.out.println("After remove(Index)\n"+ll);
		ll.removeFirstOccurrence(2);
		System.out.println("after removeFirstOccurrence\n"+ll);
		ll.removeLastOccurrence(2);
		System.out.println("after removeLastOccurrence\n"+ll);
		ll.remove();
		System.out.println("after remove\n"+ll);
		
	}

}
