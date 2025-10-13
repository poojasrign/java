package whileLoop;

public class Palindrome {
	public static void main(String[] args) {
		int num =121;
		int temp=num;
		int rev =0;
		while(num!=0) {
			int last=num%10;
			rev = (rev*10)+last;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println(temp+" is a palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
			
		}
	}

}
