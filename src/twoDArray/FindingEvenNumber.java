package twoDArray;

import java.util.Scanner;

public class FindingEvenNumber {
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
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
				    System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		abc.close();
	
	}

}