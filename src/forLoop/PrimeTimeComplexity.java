package forLoop;

public class PrimeTimeComplexity {
	public static void main(String[]args) {
		int num=12;
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(num+" is a prime");
		}
		else {
			System.out.println(num+" is not a prime");
		}
	}

}
