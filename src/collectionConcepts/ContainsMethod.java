package collectionConcepts;
import java.util.ArrayList;
import java.util.Scanner;
public class ContainsMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		arr.add("IT");
		arr.add("AIML");
		arr.add("ECE");
		System.out.println(arr);
		System.out.println(arr.contains("it"));
	}

}
