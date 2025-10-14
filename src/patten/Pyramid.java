package patten;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		System.out.println("Enter number of Rows : ");
		Scanner sc=new Scanner(System.in);
		int rows = sc.nextInt(); 
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
	}

}
