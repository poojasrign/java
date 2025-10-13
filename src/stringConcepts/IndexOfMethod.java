package stringConcepts;

public class IndexOfMethod {
	public static void main(String[] args) {
		String st1= "Kavin is a excellent programmer in vcet";
		System.out.println(st1.indexOf('i'));
		System.out.println(st1.indexOf("in"));
		System.out.println(st1.indexOf("bad"));
		System.out.println(st1.indexOf("e"));
		System.out.println(st1.indexOf("e",15));
		System.out.println(st1.indexOf("e",18,25));
	}

}
