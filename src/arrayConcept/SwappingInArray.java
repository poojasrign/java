package arrayConcept;
import java.util.Arrays;
public class SwappingInArray {
	public static void main(String[] args) {
		int arr[]= {25,99,15,46,78,93};
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp; 
		System.out.println("Using Index: ");
		for(int i=0;i<arr.length;i++) { //using index (method 1)
			System.out.println(i+":"+arr[i]);
		}
		System.out.println("Using For Loop: "); //without using index (method 2)
		for(int n:arr) {
			System.out.println(n);
		}
		System.out.println("Using built in Method: ");
		System.out.println(Arrays.toString(arr)); // using Built-in method (method 3)
	}

}
