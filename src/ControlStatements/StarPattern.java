package ControlStatements;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		int n;
		System.out.println("ENTER THE n NUMBER");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println("  ");
		}
	
	}

}
