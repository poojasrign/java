package stringConcepts;

public class SplitMethod {
	public static void main(String[] args) {
		String st1= "Kavin is a best coder";
		String arr[]=st1.split(" ");
		for(String st:arr) {
			System.out.println(st);
		}
	}

}
