package linkedListConcept;
import java.util.LinkedList;
public class LinkedListBascis {
	public static void main(String[] args) {

		LinkedList<Integer> al=new LinkedList<>();

		al.add(1);

		al.add(2);

		al.add(3);

		al.add(4);

		al.add(1);

		System.out.println(al);

		System.out.println(al.size());

		System.out.println(al.get(2));

		al.set(2, 10);

		System.out.println(al);

		al.remove(3);

		System.out.println(al);

		for(int i=0;i<al.size();i++) {

			System.out.println(al.get(i));

		}

		for(int i:al) {

			System.out.println(i);

		}

	}

}
