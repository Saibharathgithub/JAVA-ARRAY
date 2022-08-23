package java_array;
import java.util.Scanner;
public class TranposeMatrix_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NO.OF ROWS :");
		int r = scan.nextInt();
		System.out.println("ENTER THE NO.OF COLUMNS");
		int c = scan.nextInt();
		System.out.println("ENTER THE ELEMENTS");
		int a[][]=new int[r][c];
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				a[i][j]=scan.nextInt();
			}
			System.out.println("ORIGINAL MATRIX IS : ");
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(a[i][j]+ " ");
				}
				System.out.println("" );
			}
			System.out.println("TRANSPOSE MATRIX IS : ");
			for(int i=0;i<c;i++) {
				for(int j=0;j<r;j++) {
					System.out.print(a[j][i]+ " ");
				}
				System.out.println(" " );
			
		
		
		// TODO Auto-generated method stub

	}

	}
}
