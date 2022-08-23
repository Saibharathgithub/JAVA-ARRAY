package RealTimeSenerios;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		int Balance=1000000,withdraw,deposit;
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("AUTOMATED TELLER MACHINE");
			System.out.println("CHOOSE 1 FOR WITHDRAW");
			System.out.println("CHOOSE 2 FOR DEPOSIT");
			System.out.println("CHOOSE 3 FOR CHECK BALANCE ");
			System.out.println("CHOOSE THE OPERATION YOU WANT TO PERFORME");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 :
				System.out.println("ENTER THE MONEY TO WITHDRAW ");
				withdraw  = sc.nextInt();
				if(Balance>=withdraw) {
					Balance=Balance-withdraw;
					System.out.println("PLEASE COLLECT YOUR MONEY ");
					System.out.println("REMAINING BALANCE IN YOUR ACCOUNT IS "+Balance);
				}
				else {
					System.out.println("INSUFFICIENT BALANCE");
				}
				System.out.println(" ");
				break;
			case 2 :
				System.out.println("ENTER THE MONEY TO DEPOSIT");
				deposit = sc.nextInt();
				Balance=deposit+Balance;
				System.out.println("YOUR MONEY HAS BEEN SUCCESSFULLY DEPOSITED ");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("BALANCE IS : "+Balance);
				System.out.println(" ");
				break;
			case 4 :
				System.exit(0);
			}
			    	
				
				
		}
	}

}
