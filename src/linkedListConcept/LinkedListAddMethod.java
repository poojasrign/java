package linkedListConcept;
import java.util.LinkedList;
public class LinkedListAddMethod {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.add(39);
		ll.add(59);
		ll.add(7);
		ll.add(8);
		ll.add(66);
		System.out.println("original\n"+ll);
		ll.addFirst(3);
		System.out.println("Add At First\n "+ll);
		ll.addLast(2);
		System.out.println("Add At Last\n"+ll);
		ll.add(1,1);
		System.out.println("Add\n"+ll);
		

	}

}
