package collectionConcepts;
import java.util.ArrayList;
import java.util.Scanner;
public class ProgramInCollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		al.add("IT");
		al.add("CSE");
		al.add("AIML");
		al.add("ECE");
		int num=al.size();
		if(al.isEmpty()) { 
			for(int i=0;i<4;i++) {
				System.out.println("Enter String :");
				String num1=sc.nextLine();
				al.add(num1);
			}
			System.out.println(al);
		}
		else if(num%2==0) {
			for(int i=0;i<num;i++) {
				System.out.println("Enter String :");
				String num1=sc.nextLine();
				al.add(num1);
			}
			System.out.println(al);
		}
		else {
			System.out.println(al);
		}
	}

}
