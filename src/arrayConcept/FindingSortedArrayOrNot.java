package arrayConcept;

public class FindingSortedArrayOrNot {
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,11,10};
		int i=0;
		boolean sort=true; 
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sort=false;
				break;
			}
		}
		if(sort) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}

}
