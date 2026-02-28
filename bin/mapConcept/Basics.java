package mapConcept;
import java.util.HashMap;
import java.util.Map;
public class Basics {
	public static void main(String[] agrs) {
		Map<Integer,String> m= new HashMap<>();
		m.put(0,"list");
		m.put(1,"Tree");
		m.put(2,"Set");
		m.put(2,"Tree");
		System.out.println(m);
		System.out.println(m.get(0));
		System.out.println(m.size());
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("Set"));
	}

}
