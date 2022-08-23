package ControlStatements;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num = sc.nextInt();
		int reverse=0;
		while(num!=0) {
			int r=num%10;
			reverse = reverse*10+r;
			num=num/10;
		}
		System.out.println("THE REVERSED VALUE IS :" +reverse);
	}

}
