package java_array;

public class SubMatrix {

	public static void main(String[] args) {
		int a [][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b [] [] = new int [2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				b [i][j] =a[i+1][j+1];
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
