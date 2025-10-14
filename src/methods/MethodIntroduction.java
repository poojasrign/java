package methods;
import java.util.Scanner;
public class MethodIntroduction {
	void add() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
		sc.close();
	}
	public static void main(String args[]) {
		MethodIntroduction obj = new MethodIntroduction();
		System.out.println("Method calling 1");
		obj.add();
		System.out.println("Method Return 1");
		System.out.println("Method calling 2");
		obj.add();
		System.out.println("Method Return 2");
		System.out.println("Method calling 3");
		obj.add();
		System.out.println("Method Return 3");
	}
}