package collectionConcepts;
import java.util.ArrayList;
import java.util.Scanner;
public class StringGetByUserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of string to be Enter :");
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList <String> al=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter a string");
			String str=sc.nextLine();
			al.add(str);
		}
		System.out.println(al);
	}
	

}
