package whileLoop;

public class Amstrong {
	public static void main(String[] args) {
		int num =53;
		int temp=num;
		int res =0;
		while(num!=0) {
			int last=num%10;
			res = (last*last*last)+res;
			num=num/10;
		}
		if(temp==res) {
			System.out.println(temp+" is a Amstrong Number");
		}
		else {
			System.out.println(temp+" is not a Amstrong Number");
			
		}
	}

}
