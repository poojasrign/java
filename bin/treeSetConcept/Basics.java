package treeSetConcept;
import java.util.Set;
import java.util.TreeSet;
public class Basics {
	public static void main(String[] agrs) {
		Set<String> st= new TreeSet<>();
		st.add("Harshini");
		st.add("Harshini");
		st.add("Manisha");
		st.add("Manisha");
		st.add("Akshaya");
		st.add("Vaishalini");
		System.out.println(st);
		System.out.println("size of this set is : "+st.size());

	}

}
