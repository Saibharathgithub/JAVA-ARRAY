package java_array;
import java.util.Scanner;
public class String_Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING : " );
		String str = sc.nextLine();
		int len =str.length();
		System.out.println("LETTER\tFREQUENCY ");
		for(char ch='A';ch<='z';ch++){
				int c=0;
				for(int i=0;i<len;i++) {
					if(ch==str.charAt(i))
						c++;	
					}
					if(c!=0) {
						System.out.println(ch+"\t"+c);
				 }
				}
	}


}
