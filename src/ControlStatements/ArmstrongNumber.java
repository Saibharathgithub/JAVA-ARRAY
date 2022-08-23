package ControlStatements;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,r,sum=0;
		System.out.println("ENTER THE NUMBER : ");
         n=sc.nextInt();
         int result = n;
         while(n>0) {
        	r=n%10;
        	n=n/10;
        	sum =sum + (r*r*r);
         }
         if(result==sum) {
        	 System.out.println("THE GIVEN NUMBER IS A ARMSTRONG NUMBER ");
         }
         else {
        	 System.out.println("THE GIVEN NUMBER IS A NOT A ARMSTRONG NUMBER");
         }
		
	}

}
