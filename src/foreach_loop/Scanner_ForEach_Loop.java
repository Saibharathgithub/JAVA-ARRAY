package foreach_loop;
import java.util.Scanner;
public class Scanner_ForEach_Loop {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("ENTER THE NO.OF ELEMENTS YOU WANT TO STORE : ");
	    n = sc.nextInt();
	    int a [] = new int [10];
	    System.out.println("ENTER THE NUMBERS : ");
	    for(int i =0;i<a.length;i++) {
	    	a[i] = sc.nextInt();
	    }
	    System.out.println("ARRAY ELEMENT ARE : " ) ;
	    for (int i=0;i<n;i++) {
	    	System.out.println(a[i]);
	    }
		// TODO Auto-generated method stub

	}

}
