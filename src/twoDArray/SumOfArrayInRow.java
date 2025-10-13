package twoDArray;

import java.util.Scanner;

public class SumOfArrayInRow {
	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		Scanner abc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter Data : ");
				arr[i][j]=abc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j]; 
			}
			System.out.println(i+"Row Sum "+sum);
		}
		abc.close();
	}
}
			
