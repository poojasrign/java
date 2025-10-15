package stackConcept;
import java.util.Stack;
public class Basics {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(25);
		st.push(36);
		st.push(3);
		st.push(23);
		st.push(31);
		System.out.println(st);
		System.out.println("Pop Method :"+st.pop());
		System.out.println("After Pop Method :"+st);
		System.out.println("Peek Method :"+st.peek());
		System.out.println("After Peek Method :"+st);
		System.out.println("Size Method :"+st.size());
		System.out.println("Empty Method :"+st.empty());
		st.clear();
		System.out.println("After Clear Method :"+st);
		System.out.println("Capacity :"+st.capacity());
	}
}