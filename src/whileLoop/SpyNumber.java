package whileLoop;
import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		int sum=0,pro=1;
		int temp=num;
		while(temp>0) {
			int digit=temp%10;
			sum=sum+digit;
			pro=pro*digit;
			temp=temp/10;
		}
		System.out.println("sum "+sum);
		System.out.println("Product "+pro);
		if(sum==pro) {
			System.out.println("It is a Spy Number");
		}
		else {
			System.out.println("It is not a Spy Number");
		}
		
	}
	

}
