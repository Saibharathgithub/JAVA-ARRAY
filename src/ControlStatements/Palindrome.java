package ControlStatements;

public class Palindrome {

	public static void main(String[] args) {
		int n =232,sum=0,r;
		int temp=n;
		while(n>0) {
			r = n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum) {
			System.out.println("THE GIVEN NUMBER IS PALINDROME");
			}
		else {
			System.out.println("THE GIVEN NUMBER IS NOT A PALINDROME");
		}
		
	}

}
