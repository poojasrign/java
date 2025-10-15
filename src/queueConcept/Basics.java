package queueConcept;
import java.util.LinkedList;
import java.util.Queue;
public class Basics {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		q.add("Resi");
		q.add("Sri");
		q.add("Harish");
		q.add("Kavin");
		q.add("Salman");
		q.add("Ashwin");
		q.add("Maideen");
		System.out.println(q);
		System.out.println("Poll Method "+ q.poll());
		System.out.println("After Poll Method "+q);
		System.out.println("Peek Method "+ q.peek());
		System.out.println("Peek Method "+ q);
		System.out.println("Size Method "+ q.size());
		System.out.println("Empty Method "+ q.isEmpty());
		q.clear();
		System.out.println("After Clear Method "+ q);
	}
}