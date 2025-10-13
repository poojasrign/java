package nestedLoop;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=1634;  //153,371,407,370,1634 Armstrong Number
		int temp=num;
		int len=0;
		while(num!=0) {
			len++;
			num/=10;
		}
		num=temp;
		int sum =0;
		while(num!=0) {
			int last=num%10;
			int pow=1;
			for(int i=1;i<=len;i++) {
				pow=pow*last;
			}
			sum=sum+pow;
			num/=10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a Amstrong number");
		}
		else {
			System.out.println(temp+" is not a Amstrong number");
		}
	}

}
