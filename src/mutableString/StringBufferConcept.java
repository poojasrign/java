package mutableString;

public class StringBufferConcept {
	public static void main(String[] args) {
		String st1="Kavin";
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(st1);
		System.out.println(sb);
		System.err.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("kumar is a good boy");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
