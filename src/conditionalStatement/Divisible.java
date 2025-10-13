package conditionalStatement;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] agrs) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=s.nextInt();
		s.close();
		if(a%3==0&&a%5==0) {
			System.out.println("Fizz Bizz");
		}
		else if(a%3==0) {
			System.out.println("Fizz");
		}
		else if(a%5==0) {
			System.out.println("Bizz");
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
