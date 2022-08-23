package ControlStatements;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		int num,sum=0,product=1,lastdigit;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		num = sc.nextInt();
		while(num!=0) {
			lastdigit = num%10;
			sum = sum +lastdigit;
			product = product*lastdigit;
			num=num/10;
		}
		if(sum == product) {
			System.out.println("THE GIVEN NUMBER IS A SPY NUMBER ");
		}
		else {
			System.out.println("THE GIVEN NUMBER IS NOT A SPY NUMBER ");
		}
	}

}
