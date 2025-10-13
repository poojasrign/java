package twoDArray;

import java.util.Scanner;

public class SumOfArrayInColumn {
	public static void main(String[] args) {
		int arr[][]=new int[3][2];
		Scanner abc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter Data : ");
				arr[i][j]=abc.nextInt();
			}
		}
		for(int i=0;i<arr[0].length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[j][i]; 
			}
			System.out.println(i+"column Sum "+sum);
		}
		abc.close();
	}

}
