package methods;

public class EvenOrOdd {
	boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		EvenOrOdd eo=new EvenOrOdd();
		System.out.println(eo.isEven(6)?"Even":"Odd");
		System.out.println(eo.isEven(7)?"Even":"Odd");
	}

}
