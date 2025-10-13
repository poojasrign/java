package arrayConcept;
import java.util.Scanner;
public class MarksInArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of marks");
		int sub= sc.nextInt();
		int mark[]=new int[sub];
		System.out.println("Enter the Marks");
		for(int i=0;i<mark.length;i++) {
			mark[i]=sc.nextInt();
		}
		int total=0;
		for (int i=0;i<mark.length;i++) {
			total =total+mark[i];
		}	
		System.out.println(total);
		System.out.println((float)total/mark.length-1);
		sc.close();
	}

}
