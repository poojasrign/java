package arrayConcept;

public class ArrayDeclaration {
	public static void main(String [] args) {
		String arr[]= {"Kavin","Harish","Kabilan","Salman"};
		System.out.println("Before "+arr[1]);
		arr[1]="Adhithiya";
		System.out.println("After "+arr[1]);
		System.out.println("Memory "+arr);
		float fl[]= {1.0f,2.0f,3.0f,4.0f,5.0f};
		System.out.println("Float Value "+fl[1]); 
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		
	}

}
