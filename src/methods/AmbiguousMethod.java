package methods;

public class AmbiguousMethod {
	void sum(float num1,int num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,float num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] agrs) {
		AmbiguousMethod am=new AmbiguousMethod();
		am.sum(2.0f, 1);
		am.sum(1, 2.0f);
		//am.sum(2,1); it shows Ambiguous error
	}

}
