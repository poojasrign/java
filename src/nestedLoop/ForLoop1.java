package nestedLoop;
import java.util.Scanner;
public class ForLoop1 {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}
		s.close();
	}

}
