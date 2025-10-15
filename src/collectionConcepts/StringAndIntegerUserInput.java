package collectionConcepts;
import java.util.ArrayList;
import java.util.Scanner;
public class StringAndIntegerUserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <String> al=new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter a string");
			String str=sc.nextLine();
			al.add(str);
		}
		System.out.println(al);
		Scanner sc1=new Scanner(System.in);
		ArrayList <Integer> in=new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("enter integer");
			int num=sc1.nextInt();
			in.add(num);
		}
		System.out.println(in);
	}
	

}
