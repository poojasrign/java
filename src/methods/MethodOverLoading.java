package methods;

public class MethodOverLoading {
	void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,float num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		MethodOverLoading ol=new MethodOverLoading();
		ol.sum(1, 2);
		ol.sum(1,2.0f);
		ol.sum(1, 2,5);
	}

}
