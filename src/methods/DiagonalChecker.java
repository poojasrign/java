package methods;

public class DiagonalChecker {
	boolean diagonal(int arr[][]) {
		for (int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
	              if((r==c&&arr[r][c]!=1)||(r!=c)&&(arr[r][c]!=0)) {
	            	  return false;
	              }
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int num1[][]= {{1,0,0},{0,1,0},{0,0,1}};
		int num2[][]= {{1,0,0},{0,1,0},{1,0,1}};
		DiagonalChecker d=new DiagonalChecker();
		System.out.println(d.diagonal(num1)?"Diagonal Matrix":"Not a Diagonal Matrix");
		System.out.println(d.diagonal(num2)?"Diagonal Matrix":"Not a Diagonal Matrix");

	}

}
