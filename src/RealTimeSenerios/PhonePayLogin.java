package RealTimeSenerios;
import java.util.Scanner;
public class PhonePayLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =3,p;
		do {
		System.out.println("ENTER THE LOGIN PIN AND YOUR NUMBER OF CANCES LEFT ARE ="+n);
		p=sc.nextInt();
		if(p>1000 && p<2000) {
			System.out.println("LOGIN SUCCESSFULL.");
			break;
		}
		else {
			System.out.println("INCORRECT PIN TRY AGAIN ");
			n--;
		}
		}
		while(n>0);
		if(n==0)
			System.out.println("LOGIN FAILED AND YOUR ACCOUNT HAS BEEN BLOCKED , PLEASE CONTACT BANK'S ADMINISTARTION");
	

	}

}