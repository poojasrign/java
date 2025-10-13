package forLoop;

public class Factorial {
	public static void main(String[]args) {
		int num=5;
		int fact=1;
		int sum=0;
		for (int i=1;i<=num;i++) {
			fact=fact*i; //factorial of a number
			sum=sum+i; //sum of n numbers
		}
		System.out.println(fact);
		System.out.println(sum);
		
	}

}
