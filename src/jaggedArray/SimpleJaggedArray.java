package jaggedArray;

public class SimpleJaggedArray {
	public static void main(String[] args) {
		int brr[][]=new int[4][];
		brr[0]=new int[3];
		brr[1]=new int[2];
		brr[2]=new int[1];
		brr[3]=new int[5];
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
