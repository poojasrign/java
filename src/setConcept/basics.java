package setConcept;
import java.util.HashSet;
import java.util.Set;
public class basics {
	public static void main(String[] args) {
		Set<String> st=new HashSet<>();
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
