package collectionConcepts;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class SortingInCollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		arr.add("IT");
		arr.add("AIML");
		arr.add("ECE");
		System.out.println("Before sorting : ");
		System.out.println(arr);
		System.out.println("After sorting : ");
		Collections.sort(arr);
		System.out.println(arr);
		for (String str:arr) { //
			System.out.print(str+" ");
		}
		
		
	}

}
