package operators;

public class Ternary {
	public static void main(String[]args) {
	int mark=101;
	String res= (mark>=0&&mark<=100)?((mark>49)?"pass":"fail"):"invalid mark";
	System.out.println(res);
	}
}
