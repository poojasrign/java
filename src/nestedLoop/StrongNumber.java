package nestedLoop;

public class StrongNumber {
	public static void main(String[] args) {
		int num=146;
		int temp = num;
		int sum=0;
		while(temp!=0) {
			int last=temp%10;
			int fact =1;
			for(int i=1;i<=last;i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			temp/=10;
		}
		if(num==sum) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
	}

}
