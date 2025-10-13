package arrayConcept;

public class FindingMinMaxInArray {
	public static void main(String[] args) {
		int arr[]= {25,99,15,46,78,93};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				{
					min=arr[i];
				}
			}
		}
		System.out.println("Minimum Number in array: "+min);
		System.out.println("Maximum Number in array: "+max);
		
	}

}
