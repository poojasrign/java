package nestedLoop;
import java.util.Scanner;
public class PrimeBetweenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Starting Value :");
		int start= sc.nextInt();
		System.out.println("Ending Value :");
 		int end= sc.nextInt();
 		sc.close();
		for(int num=start;num<=end;num++) {
			int count=0;
			for (int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num);
			}
		}
	}
}
